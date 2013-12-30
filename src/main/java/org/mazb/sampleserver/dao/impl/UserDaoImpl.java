package org.mazb.sampleserver.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mazb.sampleserver.dao.UserDao;
import org.mazb.sampleserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mazbergaz@gmail.com
 */
@Service
public class UserDaoImpl implements UserDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insertUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.flush();
        session.close();
    }

    @Override
    public void deleteUser(User user) {
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.delete(session.load(User.class, user.getId()));
	session.getTransaction().commit();
	session.flush();
	session.close();
    }

    @Override
    public User getUser(int id) {
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("select u from User u where u.id = :id");
            q.setParameter("id", id);
            return (User) q.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getUser(String userName) {
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("select u from User u where u.userName = :userName");
            q.setParameter("userName", userName);
            return (User) q.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public User checkUser(String userName, String password){
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("select u from User u where u.userName=:userName and u.password=:password");
            q.setParameter("userName", userName);
            q.setParameter("password", password);
            return (User) q.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("from User");
            return q.list();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
