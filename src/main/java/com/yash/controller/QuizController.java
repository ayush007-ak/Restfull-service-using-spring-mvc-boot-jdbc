package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.QuizResponse;
import com.yash.service.QuizService;

@RestController
@RequestMapping("api")
public class QuizController {
	
	@Autowired
	private QuizService quizservice;
	//@RequestMapping(value="employees",method = RequestMethod.GET)
	@GetMapping("quizdata")
	public ResponseEntity<List<QuizResponse>> handleGetAllEmployeesJSON(){
		List<QuizResponse> quizResponseList=quizservice.quizesRetrievalServicesJSON();
		ResponseEntity<List<QuizResponse>> response=null;
		if(!quizResponseList.isEmpty()) {
		 response=new ResponseEntity<List<QuizResponse>>(quizResponseList,HttpStatus.OK);
		}else {
			response=new ResponseEntity<List<QuizResponse>>(quizResponseList,HttpStatus.EXPECTATION_FAILED);
		}
		return response;
	}

}
