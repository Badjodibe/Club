package com.badjo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Inscription")
@Data @NoArgsConstructor @AllArgsConstructor
public class RegistrationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "dinsc")
	private Date dateinscription;
	@Column(name = "adh")
	
	private long idAdherant;
	public RegistrationDetails(long id, Date dateinscription, long idAdherant) {
		super();
		this.id = id;
		this.dateinscription = dateinscription;
		this.idAdherant = idAdherant;
	}
	public RegistrationDetails() {
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
	public long getIdAdherant() {
		return idAdherant;
	}
	public void setIdAdherant(long idAdherant) {
		this.idAdherant = idAdherant;
	}
	
	
}
