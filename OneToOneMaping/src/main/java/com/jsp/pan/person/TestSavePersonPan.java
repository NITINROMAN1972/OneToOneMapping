package com.jsp.pan.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nitin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pan pan = new Pan();
		pan.setPan_no(635272573);
	
		
		
		Person person = new Person();
		person.setName("NITIN ROMAN");
		person.setDob("16/06/2001");
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		System.out.println("ALL GOOD ");
	}

}
