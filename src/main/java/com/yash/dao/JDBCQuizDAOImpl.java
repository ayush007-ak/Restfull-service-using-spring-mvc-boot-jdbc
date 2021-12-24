package com.yash.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.yash.entity.Quiz;
import com.yash.helper.QuizDBQuery;
import com.yash.integrate.ConnectionManager;


@Repository("JDBCQuizDAOImpl")
public class JDBCQuizDAOImpl implements QuizDAO {
	
	@Autowired
	private ConnectionManager connectionManager;
	@Autowired
	private QuizDBQuery quizdbquery;
	

	@Override
	public List<Quiz> getQuiz() {
		Connection connection=connectionManager.openConnection();
		List<Quiz> quizList=new ArrayList<Quiz>();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(quizdbquery.getSelectDataQuery());
			while(resultSet.next()) {
				Quiz q=new Quiz();
				q.setQID(resultSet.getInt(1));
				q.setQuestions(resultSet.getString(2));
				q.setOption1(resultSet.getString(3));
				q.setOption2(resultSet.getString(4));
				q.setOption3(resultSet.getString(5));
				q.setOption4(resultSet.getString(6));
				quizList.add(q);
			}
			connectionManager.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quizList;
		
	}

	@Override
	public Quiz getQuizById(int QID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean persistQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return false;
	}

}
