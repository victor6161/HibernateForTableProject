package com.iba.kozlov.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.iba.kozlov.entity.ReaderEntity;
import com.iba.kozlov.hibernate.HibernateSessionFactory;

public class ReaderDao {
	private static final Logger LOGGER = Logger.getLogger(ReaderDao.class);
	public List<ReaderEntity> getList() {
		LOGGER.info("getList");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<ReaderEntity> list = session.createCriteria(ReaderEntity.class).list();
        session.getTransaction().commit();
        return list;
    }

}
