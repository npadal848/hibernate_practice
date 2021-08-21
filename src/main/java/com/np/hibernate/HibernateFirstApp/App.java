package com.np.hibernate.HibernateFirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(101);
		student.setName("Sivu");
		student.setBranch("Mechanical");
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
	}
}
