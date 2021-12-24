package com.yash.helper;


public class EmployeeDBQuery {
	private String selectEmployeeQuery;
	private String insertEmployeeQuery;
	private String updateEmployeeQuery;
	private String deleteEmployeeQuery;
	private String selectEmployeeByIdQuery;
	private String selectEmployeeDesignationQuery;
	private String checkEmpIdQuery;
	
	public EmployeeDBQuery() {}


	public String getSelectEmployeeQuery() {
		return selectEmployeeQuery;
	}


	public String getCheckEmpIdQuery() {
		return checkEmpIdQuery;
	}


	public void setCheckEmpIdQuery(String checkEmpIdQuery) {
		this.checkEmpIdQuery = checkEmpIdQuery;
	}


	public String getSelectEmployeeDesignationQuery() {
		return selectEmployeeDesignationQuery;
	}


	public void setSelectEmployeeDesignationQuery(String selectEmployeeDesignationQuery) {
		this.selectEmployeeDesignationQuery = selectEmployeeDesignationQuery;
	}


	public void setSelectEmployeeQuery(String selectEmployeeQuery) {
		this.selectEmployeeQuery = selectEmployeeQuery;
	}


	public String getInsertEmployeeQuery() {
		return insertEmployeeQuery;
	}


	public void setInsertEmployeeQuery(String insertEmployeeQuery) {
		this.insertEmployeeQuery = insertEmployeeQuery;
	}


	public String getUpdateEmployeeQuery() {
		return updateEmployeeQuery;
	}


	public void setUpdateEmployeeQuery(String updateEmployeeQuery) {
		this.updateEmployeeQuery = updateEmployeeQuery;
	}


	public String getDeleteEmployeeQuery() {
		return deleteEmployeeQuery;
	}


	public void setDeleteEmployeeQuery(String deleteEmployeeQuery) {
		this.deleteEmployeeQuery = deleteEmployeeQuery;
	}


	public String getSelectEmployeeByIdQuery() {
		return selectEmployeeByIdQuery;
	}


	public void setSelectEmployeeByIdQuery(String selectEmployeeByIdQuery) {
		this.selectEmployeeByIdQuery = selectEmployeeByIdQuery;
	}


	@Override
	public String toString() {
		return "EmployeeDBQuery [selectEmployeeQuery=" + selectEmployeeQuery + ", insertEmployeeQuery="
				+ insertEmployeeQuery + ", updateEmployeeQuery=" + updateEmployeeQuery + ", deleteEmployeeQuery="
				+ deleteEmployeeQuery + ", selectEmployeeByIdQuery=" + selectEmployeeByIdQuery + "]";
	}
	
	
}
