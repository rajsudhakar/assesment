package com.entertainment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entertainment.model.Entertainments;

@Repository
public interface EntertainmentsRepository extends JpaRepository<Entertainments, Integer>{

	List<Entertainments> findAll();
	Entertainments findById(int serialId);
	List<Entertainments> findBytype(String type);
	
}
