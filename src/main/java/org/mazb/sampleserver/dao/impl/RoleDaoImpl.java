package org.mazb.sampleserver.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mazb.sampleserver.dao.RoleDao;
import org.mazb.sampleserver.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mazbergaz@gmail.com
 */
@Service
public class RoleDaoImpl implements RoleDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insertRole(Role role) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
        session.flush();
        session.close();
    }

    @Override
    public void updateRole(Role role) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(role);
        session.getTransaction().commit();
        session.flush();
        session.close();
    }

    @Override
    public void deleteRole(Role role) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(session.load(Role.class, role.getId()));
        session.getTransaction().commit();
        session.flush();
        session.close();
    }

    @Override
    public Role getRole(String code) {
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("select r from Role r where r.code = :code");
            q.setParameter("code", code);
            return (Role) q.uniqueResult();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Role> getAllRoles() {
        try{
            Session session = sessionFactory.openSession();
            Query q = session.createQuery("from Role");
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
