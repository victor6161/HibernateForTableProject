package com.iba.kozlov.dao;
import com.iba.kozlov.entity.WriterEntity;
import com.iba.kozlov.hibernate.HibernateSessionFactory;

import org.apache.log4j.Logger;
import org.hibernate.Session;


import java.util.List;
public class WriterDao {
	private static final Logger LOGGER = Logger.getLogger(WriterDao.class);
	public List<WriterEntity> read() {
		LOGGER.info("getList");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<WriterEntity> list = session.createCriteria(WriterEntity.class).list();
        session.getTransaction().commit();
        return list;
    }
	public void create(WriterEntity writerEntity) {
		LOGGER.info("save");
	     Session session = HibernateSessionFactory.getSessionFactory().openSession();
	     session.beginTransaction();
	     session.save(writerEntity);
	     session.getTransaction().commit();
	     session.close();
		
	}
	public void update(WriterEntity writerEntity) {
		LOGGER.info("updateWriter");
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(writerEntity);
		session.getTransaction().commit();
	    session.close();
	}
}
