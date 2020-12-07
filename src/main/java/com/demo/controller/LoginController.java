package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
		
		@RequestMapping(value="/validate", method=RequestMethod.POST) //request handler checks for url and if matches then dispatcher servlet will come here
		public ModelAndView validateUser(@RequestParam("uname") String uname,@RequestParam("pass") String pass) {
			//String uname=request.getParameter("uname");
			//String pass=request.getParameter("pass");
			String msg=null;
			if(uname.equals("ashwini")&&(pass.equals("ashwini123"))) {
				msg="User is valid";
			}
			else {
				msg="User is invalid";
			}
			
			return new ModelAndView("displayMessage","msg",msg);
			
		}
}
