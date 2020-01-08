package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller

@RequestMapping(value="/seven")
public class AppController {
	@GetMapping(value="/one")
public String functionOne(){
	return "success";
}
	@GetMapping(value="/")
	public String fistpage(){
		return "index";
	}
	@GetMapping(value="/second/{aa}")
	public String secondpage(@PathVariable("aa") String userName,Model model){
		Student student=new Student();
		student.setStudId(1234);
		student.setStudName("nalini");
		System.out.println("UserName:" +userName);  //logger
		model.addAttribute("key1",userName);
		model.addAttribute("key2", student);
		return "second";
	}
}
