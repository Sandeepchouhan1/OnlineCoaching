package com.cg.coaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.coaching.beans.Student;
import com.cg.coaching.services.OnlineCoachingServices;

@RestController
public class CoachingController {

		@Autowired
		private OnlineCoachingServices services;
		
		@RequestMapping(value="/acceptCustomerDetail",method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
		public ResponseEntity<String>acceptcustomerDetail(@ModelAttribute Student student) {
			services.acceptStudentDetails(student);
			return new ResponseEntity<>("Customer details succesfully added",HttpStatus.OK);
			}
		
		
}