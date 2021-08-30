package com.tech.vormetric.ws.mapper;

import javax.enterprise.context.ApplicationScoped;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@Mapper
@Mapper
public  interface EventMapper {
	
	
	 EventMapper INSTANCE = Mappers.getMapper( EventMapper.class ); 
	  
	    @Mapping(source = "title", target = "mytitle")
	    @Mapping(target = "dateCreated", ignore = true)
	    public abstract com.tech.vormetric.ws.entity.Event eventDbToWs(com.tech.vormetric.db.model.Event event); 
	    
	    
	    @Mapping(source = "mytitle", target = "title")
	    @Mapping(target = "dateCreated", ignore = true)
	    public abstract com.tech.vormetric.db.model.Event eventWsToDb(com.tech.vormetric.ws.entity.Event event); 
}
