package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.situaciones;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class Situaciones_Repositorio {
    
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<situaciones> getSituaciones() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(situaciones.class);
        return criteria.list();
    }

    
}
