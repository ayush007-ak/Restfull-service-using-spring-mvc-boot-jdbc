package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.QuizDAO;

import com.yash.entity.Quiz;

import com.yash.model.QuizRequest;
import com.yash.model.QuizResponse;
import com.yash.model.QuizResponses;
@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizDAO quizdao;
	
	/****
	 
	 List<Employee> employeeList=employeeDAO.getAllEmployees();
		List<EmployeeResponse> employeeResponseList=new ArrayList<EmployeeResponse>();
		for(Employee employee:employeeList) {
			EmployeeResponse employeeResponse=new EmployeeResponse();
			employeeResponse.setEmpId(employee.getEmpId());
			employeeResponse.setEmpName(employee.getEmpName());
			employeeResponse.setEmpSalary(employee.getEmpSalary());
			employeeResponse.setEmpDesignation(employee.getEmpDesignation());
			employeeResponseList.add(employeeResponse);
		}
		EmployeeResponses employeeResponses=new EmployeeResponses();
		employeeResponses.setEmployeeResponse(employeeResponseList);
		return employeeResponses;
	} 
	 * */

	@Override
	public QuizResponses quizesRetrievalServicesXML() {
		List<Quiz> quizList = quizdao.getQuiz();
		List <QuizResponse> quizResponseList = new ArrayList<QuizResponse>();
		for(Quiz quiz:quizList) {
			QuizResponse quizResponse = new QuizResponse();
			quizResponse.setQID(quiz.getQID());
			quizResponse.setQuestions(quiz.getQuestions());
			quizResponse.setOption1(quiz.getOption1());
			quizResponse.setOption2(quiz.getOption2());
			quizResponse.setOption3(quiz.getOption3());
			quizResponse.setOption4(quiz.getOption4());
		}
		
		QuizResponses quizResponses = new QuizResponses();
		quizResponses.setQuizresponse(quizResponseList);
		return quizResponses;
	}

	@Override
	public List<QuizResponse> quizesRetrievalServicesJSON() {
		List<Quiz> quizList = quizdao.getQuiz();
		List <QuizResponse> quizResponseList = new ArrayList<QuizResponse>();
		for(Quiz quiz:quizList) {
			QuizResponse quizResponse = new QuizResponse();
			quizResponse.setQID(quiz.getQID());
			quizResponse.setQuestions(quiz.getQuestions());
			quizResponse.setOption1(quiz.getOption1());
			quizResponse.setOption2(quiz.getOption2());
			quizResponse.setOption3(quiz.getOption3());
			quizResponse.setOption4(quiz.getOption4());
			quizResponseList.add(quizResponse);

	}
		return quizResponseList;
	}

	@Override
	public QuizResponse getQuiz(int QID) {
		Quiz quiz = quizdao.getQuizById(QID);
		QuizResponse quizResponse = new QuizResponse();
		quizResponse.setQID(quiz.getQID());
		quizResponse.setQuestions(quiz.getQuestions());
		quizResponse.setOption1(quiz.getOption1());
		quizResponse.setOption2(quiz.getOption2());
		quizResponse.setOption3(quiz.getOption3());
		quizResponse.setOption4(quiz.getOption4());
		return quizResponse;
	}

	@Override
	public boolean persistQuiz(QuizRequest quizRequest) {
		// TODO Auto-generated method stub
		return false;
	}

}
