package com.Harsha;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentJDBCTemplate  studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("StudentJDBCTemplate");
		System.out.println("------Records Creation--------" );
		studentJDBCTemplate.create("Harsha",11);
		studentJDBCTemplate.create("Duvvuri",10);
		studentJDBCTemplate.create("Duvvuriabap",34);
		
		System.out.println("------Listing Multiple Records--------" );
		List<Student> students = studentJDBCTemplate.listStudents();
		for(Student record: students)
		{
			System.out.println("ID : " +record.getId());
			System.out.println(" ,Name : " +record.getName());
			System.out.println(", Age : " +record.getAge());
			
		}
		
		System.out.println("----Updating Record with ID = 2 -----" );
		studentJDBCTemplate.update(2, 20);
		
		 System.out.println("----Listing Record with ID = 2 -----" );
		 Student student = studentJDBCTemplate.getStudent(2);
		 System.out.println("ID : " +student.getId());
		 System.out.println(", Name : " +student.getName());
		 System.out.println(",Age : " +student.getAge());
		 
		
	}
}
