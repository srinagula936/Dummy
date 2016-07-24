package com.Harsha;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{
	//Rowmapper is an interface used by JdbcTemplate for mapping rows of a ResultSet on a per-row basis
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

	
}
