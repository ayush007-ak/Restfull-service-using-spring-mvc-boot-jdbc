package com.yash.service;

import java.util.List;

import com.yash.model.QuizRequest;
import com.yash.model.QuizResponse;
import com.yash.model.QuizResponses;


public interface QuizService {
	
	public QuizResponses quizesRetrievalServicesXML();
	public List<QuizResponse> quizesRetrievalServicesJSON();
	public QuizResponse getQuiz(int QID);
	public boolean persistQuiz(QuizRequest quizRequest);
	//public boolean updateQuiz(int QID,double empSalary);
	//public boolean deleteEmployee(int empId);


}
