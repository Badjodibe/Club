package com.badjo.services;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badjo.dao.RegistrationDAO;
import com.badjo.dto.RegistrationRequest;
import com.badjo.dto.RegistrationResponse;
import com.badjo.model.AdherantResponse;
import com.badjo.model.RegistrationDetails;
import com.badjo.openfeign.AdherantClient;

@Service
public class RegistrationServices {

	@Autowired
	RegistrationDAO registrationDao;
	@Autowired
	AdherantClient adhclient;
	
	public RegistrationResponse getRegistrationById(long id) {
		RegistrationDetails regiDetails = registrationDao.findById(id).get();
		AdherantResponse res = adhclient.getAdherantById(regiDetails.getIdAdherant());
		RegistrationResponse registrationResponse = new RegistrationResponse(regiDetails.getId() 
				, res,regiDetails.getDateinscription());
		return registrationResponse;
	}
	
	public RegistrationResponse addRegistration(RegistrationRequest regirequest) {
		
		LocalDate currentDate = LocalDate.now();
		Date sqlDate = Date.valueOf(currentDate);
		regirequest.setDateInscription(sqlDate);
		RegistrationDetails registration = new RegistrationDetails();
		registration.setDateinscription(regirequest.getDateInscription());
		registration.setId(regirequest.getId());
		registration.setIdAdherant(regirequest.getIdAdherant());
		registrationDao.save(registration);
		AdherantResponse adhResp = adhclient.getAdherantById(regirequest.getIdAdherant());
		RegistrationResponse registrationResponse = new RegistrationResponse(registration.getId() 
				, adhResp,registration.getDateinscription());
		return registrationResponse;
	}
	
}
