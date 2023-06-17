package com.badjo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.badjo.model.RegistrationDetails;

@Repository
public interface RegistrationDAO extends JpaRepository<RegistrationDetails, Long> {

}
