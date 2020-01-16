package com.sit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sit.model.PersonDetailsInfo;
import com.sit.service.PasspostMangService;

import net.bytebuddy.agent.builder.ResettableClassFileTransformer;

@Controller
public class PersonDetailsController {

	@Autowired
	private PasspostMangService psptMangService;

	@RequestMapping(value = "/")
	public String displayForm(HttpServletRequest req, Model model) {
		String param = null;
		PersonDetailsInfo pInfo = new PersonDetailsInfo();
		if ((param = req.getParameter("pid")) != "" && (param != null)) {
			Integer pid = Integer.parseInt(req.getParameter("pid"));
			PersonDetailsInfo prsnDtls = psptMangService.fetchPersonDtlsById(pid);
			model.addAttribute("pInfo", prsnDtls);
		} else {
			model.addAttribute("pInfo", pInfo);
		}
		return "person_details";
	}

	@RequestMapping(value = "/nextBtn", method = RequestMethod.POST)
	public String handleNextBtn(@ModelAttribute("pInfo") PersonDetailsInfo pInfo, RedirectAttributes attr) {
		Integer result = psptMangService.savePersonDetails(pInfo);
		if (result > 0) {
			attr.addFlashAttribute("pid", result);
		}

		return "redirect:displayForm?pid=" + result;

	}
}
