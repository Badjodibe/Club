package com.badjo.dto;

import org.springframework.stereotype.Repository;

import com.badjo.model.Adherant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Repository
@Data @NoArgsConstructor @AllArgsConstructor
public class AdherantResponse {

	private String fname, lname, adress;
	
	
	public AdherantResponse(String fname, String lname, String adress) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public AdherantResponse(Adherant adh) {
		this.fname = adh.getFname();
		this.lname = adh.getLname();
		this.adress = adh.getAdress();
	}
}
