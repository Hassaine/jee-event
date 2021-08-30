package com.tech.vormetric.db.core;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {
    @PersistenceContext
    private EntityManager em;

    @Produces
    @RequestScoped
    public EntityManager entityManager() {
        return em;
    }
} 