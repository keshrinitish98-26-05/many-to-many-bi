package com.ty.PersonAndCab;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestsavePersonAndCab {
	
	public static void main(String[] args) {
		
		Cab cab1=new Cab();
		cab1.setDriverName("Sandeep");
		cab1.setCost(500);
		
		Cab cab2=new Cab();
		cab2.setDriverName("madhu");
		cab2.setCost(600);
		
		Cab cab3=new Cab();
		cab3.setDriverName("Raju");
		cab3.setCost(300);
		
		Person person1=new Person();
		person1.setName("Nitish");
		person1.setEmail("niti@gmail.com");
		person1.setAge(24);
		
		Person person2=new Person();
		person2.setName("manoj");
		person2.setEmail("manu@gmail.com");
		person2.setAge(26);
		
		Person person3=new Person();
		person3.setName("anuj");
		person3.setEmail("anuj@gmail.com");
		person3.setAge(23);
		
		List<Cab> cabs1=new ArrayList<Cab>();
		cabs1.add(cab1);
		cabs1.add(cab2);
		cabs1.add(cab3);
		person1.setCab(cabs1);
		
		List<Cab> cabs2=new ArrayList<Cab>();
		cabs2.add(cab1);
		cabs2.add(cab2);
		person2.setCab(cabs2);
		
		List<Cab> cabs3=new ArrayList<Cab>();
		cabs3.add(cab2);
		cabs3.add(cab3);
		person2.setCab(cabs3);
		
		List<Person> persons1=new ArrayList<Person>();
		persons1.add(person1);
		persons1.add(person2);
		cab1.setPerson(persons1);
		
		List<Person> persons2=new ArrayList<Person>();
		persons2.add(person1);
		persons2.add(person2);
		persons2.add(person3);
		cab1.setPerson(persons2);
		
		List<Person> persons3=new ArrayList<Person>();
		persons3.add(person1);
		persons3.add(person3);
		cab1.setPerson(persons3);
		
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 
		 entityTransaction.begin();
		 entityManager.persist(person1);
		 entityManager.persist(person2);
		 entityManager.persist(person3);
		 entityManager.persist(cab1);
		 entityManager.persist(cab2);
		 entityManager.persist(cab3);
		 entityTransaction.commit();

	}

}
