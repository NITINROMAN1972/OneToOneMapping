package com.jsp.car.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nitin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Chassis chassis = new Chassis();
		chassis.setChassis_no("XRV3100");
		
		Car car = new Car();
		car.setBrand("BMW");
		car.setPrice(100000.00);
		car.setChassis(chassis);
		
		entityTransaction.begin();
        entityManager.persist(car);
        entityManager.persist(chassis);
        entityTransaction.commit();

        System.out.println("ALL GOOD");
		
	}

}
