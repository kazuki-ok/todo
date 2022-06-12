package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TopController {

	@GetMapping("/")
	public ModelAndView setTopPage(ModelAndView mav) {
		
		
//		formにserviceから値をいれて、form.getVieNemtをmavにセットする。
		mav.setViewName("/top/top");
		return mav;
	}
		
}
