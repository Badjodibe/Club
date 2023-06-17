package com.badjo.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.badjo.model.AdherantResponse;

@FeignClient(url = "${adherant.service.url}", name = "adherant-service", path = "/api/adherants")
public interface AdherantClient {

	@GetMapping("/{id}")
	public AdherantResponse getAdherantById(@PathVariable long id);
}
