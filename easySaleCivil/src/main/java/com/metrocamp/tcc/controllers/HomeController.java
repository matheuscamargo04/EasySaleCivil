package com.metrocamp.tcc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/index**" }, method = RequestMethod.GET)
	public ModelAndView indexPage(){

		ModelAndView model = new ModelAndView();
		model.addObject("title", "OLA, BEM VINDO");
		model.addObject("message", "ESSA E SUA PAGINA INICIAL");
		model.setViewName("index");
		
		return model;
	}
	
	@RequestMapping(value = {"/admin**" }, method = RequestMethod.GET)
	public ModelAndView adminPage(){

		ModelAndView model = new ModelAndView();
		model.addObject("title", "OLA, BEM VINDO ADMINISTRADOR");
		model.addObject("message", "ESSA E SUA PAGINA DE ADMINISTRADOR");
		model.setViewName("admin");
		
		return model;
	}
}
