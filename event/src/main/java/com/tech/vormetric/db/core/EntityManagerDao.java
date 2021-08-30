package com.tech.vormetric.db.core;



import java.util.List ;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager; 
import javax.persistence.PersistenceContext;
import javax.persistence.Query ;
import javax.transaction.Transactional;


@Transactional

public abstract class EntityManagerDao<T> {

    private  Class<T> persistentClass;
      
    private   EntityManager em;

    public EntityManagerDao() {
    	
    }

   
    
    public EntityManagerDao(EntityManager entityManager,Class<T> persistencClass) {
        this.persistentClass = persistencClass;
        this.em = entityManager;
		
    }

    public List<T> find(int id) {
        List<T> list;
        Query query = em.createQuery("select e from " + persistentClass.getSimpleName() + " e" + " where e.id =:id").setParameter("id", id);
        list = query.getResultList();
        return list;
    }

    public List<T> findAll() {
        List<T> list;
        Query query = em.createQuery("select e from " + persistentClass.getSimpleName() + " e");
        list = query.getResultList();
        return list;
    }

    public void create(T entity) {
        em.persist(entity);
    }

    public void edit(T entity) {
        em.merge(entity);
    }

    public void remove(T entity) {
        em.remove(em.merge(entity));
    }
}