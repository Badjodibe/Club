package com.badjo.dto;

import java.sql.Date;

import com.badjo.model.AdherantResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistrationResponse {

	private long id;
	//private long idAdherant;
	private AdherantResponse adresponse;
	private Date dateinscription;

	public RegistrationResponse(long id, long idAdherant, Date dateinscription) {
		super();
		this.id = id;
		//this.idAdherant = idAdherant;
		this.dateinscription = dateinscription;
	}
	
	public RegistrationResponse(long id, AdherantResponse adresponse, Date dateinscription) {
		super();
		this.id = id;
		this.adresponse = adresponse;
		this.dateinscription = dateinscription;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateinscription() {
		return dateinscription;
	}
	public void setDateinscription(Date dateinscription) {
		this.dateinscription = dateinscription;
	}
	public AdherantResponse getAdresponse() {
		return adresponse;
	}
	public void setAdresponse(AdherantResponse adresponse) {
		this.adresponse = adresponse;
	}
	
	
}
