package com.yash.dao;

import java.util.List;

import com.yash.entity.Quiz;

public interface QuizDAO {

	public List<Quiz> getQuiz();
	public Quiz getQuizById(int QID);
	public boolean persistQuiz(Quiz quiz);
//	public boolean updateEmployeeSalaryById(int empId,double empSalary);
//	public boolean deleteEmployee(int empId);
//	public List<String> getEmployeeDesignations();
//	public boolean checkEmpId(int empId);
}
