package com.devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devopsapi.Student;
import com.devopsapplications.Applications;

@RestController
public class RestfulController {

	@RequestMapping(value="/getUser",method = RequestMethod.GET )
	public @ResponseBody String printUser() {
		Student student = new Student();
		return student.getData();
	}
	
	@RequestMapping(value="/getApplications",method = RequestMethod.GET )
	public @ResponseBody String printApplications() {
		Applications  applications = new Applications();
		return applications.getappl();
	}
}
