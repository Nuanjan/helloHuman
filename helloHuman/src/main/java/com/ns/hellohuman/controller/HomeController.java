package com.ns.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	 @RequestMapping("/")
	    public String hello(@RequestParam(value="first_name") String fName,
	    		@RequestParam(value="last_name") String lName,
	    		@RequestParam(value="times") String times
	    		) { 
		 		int numLoop = Integer.parseInt(times);
		 		String printName = "";
		 		for(int i = 0; i < numLoop;i++) {
		 			printName +=  "Hello "+ fName + " " + lName;
	    }
		 		return printName;
	 }
	 
//	 @RequestMapping("/today")
//	 public String today() {
//		 return "Today you will find luck in all your endoeavors!";
//	 }
//	 
//	 @RequestMapping("/tomorrow")
//	 public String tomorrow() {
//		 return "Tomorrow, Tomorrow, I love you tomoorrow~";
//	 }
	 
}
