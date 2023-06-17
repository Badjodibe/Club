package com.badjo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.badjo.model.Adherant;

@Repository
public interface AdherantDAO extends JpaRepository<Adherant, Long> {

}
