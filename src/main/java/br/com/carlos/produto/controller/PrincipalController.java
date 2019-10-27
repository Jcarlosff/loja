package br.com.carlos.produto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {
	
	
	
	@RequestMapping("/principal")
	@ResponseBody
	public ModelAndView mostrar() {
		
		ModelAndView mv = new ModelAndView("Principal");
		
		return mv;
	}	


}



