package com.tech.vormetric.db.client;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.tech.vormetric.db.core.EntityManagerDao;
import com.tech.vormetric.db.model.Event;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@RequestScoped
public class EventManager extends EntityManagerDao<Event> {
	
	
	@Inject
	public EventManager(EntityManager em) {
		super(em,Event.class);
		
	}
	
	public EventManager() {
	super();	
	}
	

}
