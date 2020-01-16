package com.sit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sit.model.EducationDetailsInfo;
import com.sit.service.PasspostMangService;

@Controller
public class EducationDetailsController {

	@Autowired
	private PasspostMangService psprtMangService;

	@RequestMapping(value = "displayForm")
	public String displayForm(HttpServletRequest req, Model model) {
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		EducationDetailsInfo eduInfo = new EducationDetailsInfo();
		eduInfo.setPid(pid);
		model.addAttribute("eduDtls", eduInfo);
		List<String> degreesList = psprtMangService.fetchDegreesList();
		model.addAttribute("degrees", degreesList);
		List<String> UniversitiesList = psprtMangService.fetchUniversitiesList();
		model.addAttribute("universities", UniversitiesList);
		List<Integer> yearsList = psprtMangService.fetchYearsList();
		model.addAttribute("years", yearsList);
		return "education_details";
	}

	@RequestMapping(value = "eduNextBtn", method = RequestMethod.POST)
	public String handleNextbtn(@ModelAttribute("eduDtls") EducationDetailsInfo eduInfo, RedirectAttributes attr) {
		Integer pid = psprtMangService.saveEducationDetails(eduInfo);
		attr.addFlashAttribute("pid",pid);
		return "redirect:displayReviewForm?pid="+pid;
	}

}
