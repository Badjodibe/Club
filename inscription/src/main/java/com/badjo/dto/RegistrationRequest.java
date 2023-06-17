package com.badjo.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class RegistrationRequest {

	private long id;
	private Date dateInscription;
	private long idAdherant;
	
	public RegistrationRequest(long id, Date dateInscription, long idAdherant) {
		super();
		this.id = id;
		this.dateInscription = dateInscription;
		this.idAdherant = idAdherant;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public long getIdAdherant() {
		return idAdherant;
	}
	public void setIdAdherant(long idAdherant) {
		this.idAdherant = idAdherant;
	}
	
	
}
