package com.tech.vormetric.ws.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tech.vormetric.db.client.EventManager;
import com.tech.vormetric.db.model.Event;
import com.tech.vormetric.ws.mapper.EventMapper;



@Path("event")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
	
	@Inject
	private EventManager eventManager;
	
//	@Inject EventMapper eventMapper;
	
	@Path("new") 
	@POST
	public Response createEvent(com.tech.vormetric.ws.entity.Event event) {
		eventManager.create(EventMapper.INSTANCE.eventWsToDb(event));
		
		return Response.ok(event).build();
	}
	
	@Path("list")
	@GET
	public List<Event> listEvent() {
		
		return eventManager.findAll();

	}
	

}
