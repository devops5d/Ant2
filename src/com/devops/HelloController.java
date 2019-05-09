package com.devops;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devopsapi.Student;

import org.springframework.ui.ModelMap;
@Controller
public class HelloController {	

	@RequestMapping(value="/",method = RequestMethod.GET )
	public String printHello(ModelMap model) {
	     model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello" ;
	   }
}
	

