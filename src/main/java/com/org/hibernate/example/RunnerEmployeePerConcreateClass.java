/**
 * 
 */
package com.org.hibernate.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Saurav_Khandelwal
 *
 */
public class RunnerEmployeePerConcreateClass {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction t = session.beginTransaction();


			Employee e1 = new Employee();
			e1.setName("Gaurav Chawla");

			RegularEmployee2 e2 = new RegularEmployee2();
			e2.setName("Vivek Kumar");
			e2.setSalary(50000);
			e2.setBonus(5);

			ContractEmployee2 e3 = new ContractEmployee2();
			e3.setName("Arjun Kumar");
			e3.setPay_per_hour(1000);
			e3.setContract_duration("15 hours");

			session.persist(e1);
			session.persist(e2);
			session.persist(e3);

			t.commit();
			session.close();
			System.out.println("success");
		}
	}
}