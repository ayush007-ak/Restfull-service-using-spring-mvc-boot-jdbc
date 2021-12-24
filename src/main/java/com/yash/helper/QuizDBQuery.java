package com.yash.helper;

public class QuizDBQuery {
	private String selectDataQuery;
	private String insertDataQuery;
	private String selectQuizByIdQuery;
	public QuizDBQuery() {}
	
	
	public String getSelectDataQuery() {
		return selectDataQuery;
	}
	public void setSelectDataQuery(String selectDataQuery) {
		this.selectDataQuery = selectDataQuery;
	}
	public String getInsertDataQuery() {
		return insertDataQuery;
	}
	public void setInsertDataQuery(String insertDataQuery) {
		this.insertDataQuery = insertDataQuery;
	}
	public String getSelectQuizByIdQuery() {
		return selectQuizByIdQuery;
	}
	public void setSelectQuizByIdQuery(String selectQuizByIdQuery) {
		this.selectQuizByIdQuery = selectQuizByIdQuery;
	}

}
