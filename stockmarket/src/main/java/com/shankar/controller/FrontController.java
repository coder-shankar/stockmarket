package com.shankar.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shankar.stockdaoimpl.Floor;
import com.shankar.stockdaoimpl.FloorAPI;
import com.shankar.stockdto.FloorDto;

@Controller
public class FrontController {
	
	@RequestMapping(value= {"/","/index"})
	public ModelAndView index() {
	
		ModelAndView mv=new ModelAndView("page");	
		
		return mv;
	}

}
