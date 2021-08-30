package com.tech.vormetric.ws.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Accessors(chain=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	
	
	private String mytitle;
	private LocalDate date;
	private LocalDate dateCreated;
	
	



}