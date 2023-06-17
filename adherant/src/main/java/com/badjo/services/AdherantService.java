package com.badjo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badjo.dao.AdherantDAO;
import com.badjo.dto.AdherantRequest;
import com.badjo.dto.AdherantResponse;
import com.badjo.model.Adherant;

@Service
public class AdherantService {

	@Autowired
	AdherantDAO adhdao;
	public AdherantResponse getAdherantById(long id) {
		Adherant ad = adhdao.findById(id).get();
		return new AdherantResponse(ad);
	}
	
	public AdherantResponse addAdherant(AdherantRequest adhrequest) {
		Adherant ad = new Adherant(adhrequest.getId(), adhrequest.getFname()
				, adhrequest.getLname(), adhrequest.getAdress());
		adhdao.save(ad);
		return new AdherantResponse(ad);
	}
}
