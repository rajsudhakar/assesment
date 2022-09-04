package com.entertainment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entertainment.model.Entertainments;


public interface IEntertainmentsService {

	void addEntertaiments(Entertainments entertainments);
	void updateEntertainments(Entertainments entertainments);
	void deleteEntertainments(int serialId);
	
	List<Entertainments> getAll();
	List<Entertainments> getBytype(String type);
	Entertainments getById(int serialId);

	
}
