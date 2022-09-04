package com.entertainment;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entertainment.model.Entertainments;
import com.entertainment.model.Participants;
import com.entertainment.model.Tickets;
import com.entertainment.service.IEntertainmentsService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    
	IEntertainmentsService entertainmentsService;
	
	@Autowired
	public void setEntertainmentsService(IEntertainmentsService entertainmentsService) {
		this.entertainmentsService = entertainmentsService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Tickets ticket1 = new Tickets("Ballthrouging", 200);
		Tickets tickets2= new Tickets("Race",500);
		Participants participant1 = new Participants("Raj", "raj123@gmail", ticket1);
		Participants participant2=new Participants("VeeraRahaman","sadik123@gmail",tickets2);
		Set<Participants> participants=new HashSet<>();
		Set<Tickets> tickets=new HashSet<>();
		participants.add(participant2);
		participants.add(participant1);
		tickets.add(tickets2);
		tickets.add(ticket1);
		
		Entertainments entertainments=new Entertainments("Indoor", "Under18", tickets, participants);
	}

}
