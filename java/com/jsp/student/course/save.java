package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Aniruddha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = new Student();
		student.setName("Anirudda");
		student.setEmail("Aniruddha@gmail.com");
		
		Course course1 = new Course();
		course1.setName("SQL");
		course1.setDuration("50 Days");
		
		Course course2 = new Course();
		course2.setName("Core Java");
		course2.setDuration("90 Days");
		
		Course course3 = new Course();
		course3.setName("J2EE");
		course3.setDuration("120 Days");
		
		ArrayList<Course> a1= new ArrayList<Course>();
		a1.add(course1);
		a1.add(course2);
		a1.add(course3);
		
		student.setCourses(a1);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}

}
