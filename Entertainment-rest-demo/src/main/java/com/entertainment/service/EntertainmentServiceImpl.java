package com.entertainment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entertainment.model.Entertainments;
import com.entertainment.repository.EntertainmentsRepository;


@Service
public class EntertainmentServiceImpl implements IEntertainmentsService{
    
	@Autowired
	EntertainmentsRepository entertainmentsRepository;
	
	@Override
	public void addEntertaiments(Entertainments entertainments) {
		// TODO Auto-generated method stub
		entertainmentsRepository.save(entertainments);
		
	}

	@Override
	public void updateEntertainments(Entertainments entertainments) {
		// TODO Auto-generated method stub
		entertainmentsRepository.save(entertainments);
	}

	@Override
	public void deleteEntertainments(int serialId) {
		// TODO Auto-generated method stub
		entertainmentsRepository.deleteById(serialId);
	}

	@Override
	public List<Entertainments> getAll() {
		// TODO Auto-generated method stub
		return entertainmentsRepository.findAll();
	}

	@Override
	public List<Entertainments> getBytype(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entertainments getById(int serialId) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	@Override
//	public List<Entertainments> getBytype(String type) {
//		// TODO Auto-generated method stub
//		return entertainmentsRepository.findBytype(type);
//	}
//
//	@Override
//	public Entertainments getById(int serialId) {
//		// TODO Auto-generated method stub
//		return entertainmentsRepository.findById(serialId);
//	}
//
//	@Override
//	public List<Entertainments> getByCategory(String category) {
//		// TODO Auto-generated method stub
//		return entertainmentsRepository.findByCategory(category);
//	}

}
