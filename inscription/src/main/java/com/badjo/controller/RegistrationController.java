package com.badjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.dto.RegistrationRequest;
import com.badjo.dto.RegistrationResponse;
import com.badjo.services.RegistrationServices;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

	@Autowired
	RegistrationServices regiservice;
	@GetMapping("/{id}")
	public RegistrationResponse getRegistrationByid(@PathVariable long id) {
		RegistrationResponse regiResponse = regiservice.getRegistrationById(id);
		return regiResponse;
	}
	
	@PostMapping
	public RegistrationResponse addRegistration(@RequestBody RegistrationRequest regiRequest) {
		return regiservice.addRegistration(regiRequest);
	}
}
