package com.ty.StudentAndCourse;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestsaveStudentAndCourse {
	
	public static void main(String[] args) {
		Student student1=new Student();
		student1.setName("nitish");
		student1.setAge(24);
		
		Student student2=new Student();
		student2.setName("rahul");
		student2.setAge(25);
		
		Student student3=new Student();
		student3.setName("anuj");
		student3.setAge(23);
		
		Course course1=new Course();
		course1.setName("java");
		course1.setDuration(30);
		
		Course course2=new Course();
		course2.setName("python");
		course2.setDuration(25);
		
		Course course3=new Course();
		course3.setName("c++");
		course3.setDuration(45);
		
		List<Student> students1=new ArrayList();
		students1.add(student1);
		students1.add(student2);
		students1.add(student3);
		course1.setStudent(students1);
		List<Student> students2=new ArrayList();
		students2.add(student1);
		students2.add(student3);
		course2.setStudent(students2);
		List<Student> students3=new ArrayList();
		students3.add(student2);
		students3.add(student3);
		course3.setStudent(students3);
		
		List<Course> courses1=new ArrayList();
		courses1.add(course1);
		courses1.add(course2);
	  //courses1.add(course3);
		student1.setCourse(courses1);
		
		List<Course> courses2=new ArrayList();
		courses2.add(course1);
	    courses2.add(course3);
	    student2.setCourse(courses2);
	    List<Course> courses3=new ArrayList();
		courses3.add(course1);
		courses3.add(course2);
	    courses3.add(course3);
	    student3.setCourse(courses3);
	    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    
	    entityTransaction.begin();
	    entityManager.persist(course1);
	    entityManager.persist(course2);
	    entityManager.persist(course3);
	    entityManager.persist(student1);
	    entityManager.persist(student2);
	    entityManager.persist(student3);
	    entityTransaction.commit();
		
	}

}
