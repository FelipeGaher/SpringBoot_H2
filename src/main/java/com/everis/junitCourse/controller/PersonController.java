package com.everis.junitCourse.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.junitCourse.service.PersonService;

@Controller
@RequestMapping("/persona")
public class PersonController {

	public static final String PERSONA_VIEW = "persona";
	private static final Log LOGGER = LogFactory.getLog(PersonController.class);

	@Autowired
	@Qualifier("persona")
	private PersonService serv;
	
	// primera forma
	@GetMapping("/listarwns")
	public String getPeople(Model model) {
		model.addAttribute("people", serv.getListPeople());
		LOGGER.info("-The real Controller-");
		return PERSONA_VIEW;
	}
}
