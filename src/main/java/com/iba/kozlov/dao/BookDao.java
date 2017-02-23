package com.iba.kozlov.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.iba.kozlov.entity.BookEntity;
import com.iba.kozlov.hibernate.HibernateSessionFactory;

public class BookDao {
	private static final Logger LOGGER = Logger.getLogger(BookDao.class);
	public List<BookEntity> read() {
		LOGGER.info("read");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<BookEntity> list = session.createCriteria(BookEntity.class).list();
        session.getTransaction().commit();
        return list;
    }
	public void update(BookEntity bookEntity) {
		LOGGER.info("update");
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(bookEntity);
		session.getTransaction().commit();
	    session.close();
	}

}
