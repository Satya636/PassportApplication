package com.sit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sit.model.EducationDetailsInfo;
import com.sit.model.PassportDetailsInfo;
import com.sit.model.PersonDetailsInfo;
import com.sit.service.PasspostMangService;

@Controller
public class ReviewController {

	@Autowired
	private PasspostMangService psprtMangService;

	@RequestMapping("displayReviewForm")
	public String displayForm(HttpServletRequest req, Model model) {
		String param = req.getParameter("pid");
		if ((param != null) && (param != "")) {
			Integer pid = Integer.parseInt(param);
			PassportDetailsInfo passportInfo = new PassportDetailsInfo();
			PersonDetailsInfo prsnDtls = psprtMangService.fetchPersonDtlsById(pid);
			model.addAttribute("prsnDtls", prsnDtls);
			EducationDetailsInfo eduDtls = psprtMangService.fetchEduDtlsById(pid);
			model.addAttribute("eduDtls",eduDtls);
			model.addAttribute("pInfo", passportInfo);
		}
		return "review_details";
	}
	
	@RequestMapping(value = "confirmBtn",method = RequestMethod.POST)
	public String handleConfirmBtn(@ModelAttribute("pInfo")PassportDetailsInfo pInfo,RedirectAttributes attr) {
		String PassportDtls = psprtMangService.savePassportDtls(pInfo);
		attr.addFlashAttribute("passportNo",PassportDtls);
		return "redirect:/successPage?passportNo="+PassportDtls;
		
	}
	
	@RequestMapping("successPage")
	public String displaySuccessPage(HttpServletRequest req,Model model) {
		String passportNo=req.getParameter("passportNo");
		model.addAttribute("passportNo",passportNo);
		return "success_info";
	}
}
