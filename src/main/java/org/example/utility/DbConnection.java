package org.example.utility;

import org.example.config.HibernateConfig;

public class DbConnection {
    public Transaction transaction = null;
    public Session session = null;

    public void openSession(){
        session= HibernateConfig.getSessionFactory().openSession();
        transaction=session.beginTransaction();
    }
    public void closeSession(){
        transaction.commit();
        session.close();
    }
    public void rollback(){
        transaction.rollback();
        session.close();
    }

}
