package com.entertainment.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Entertainments {

	@Id
	@GeneratedValue(generator = "entertainments_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "entertainments_seq",sequenceName = "entertainments_seq",initialValue = 10,allocationSize = 1)
	private Integer serialId;
	@Column(length = 20)
	private String name;
	
	@Column(length = 20)
	private String type;

	@OneToMany
	private Set<Tickets> tickets;
	@ManyToMany
	private Set<Participants> participants;
	
	public Entertainments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entertainments(String name, String type, Set<Tickets> tickets,
			Set<Participants> participants) {
		super();
		this.name = name;
		this.type = type;
		this.tickets = tickets;
		this.participants = participants;
	}

	public Integer getSerialId() {
		return serialId;
	}

	public void setSerialId(Integer serialId) {
		this.serialId = serialId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public Set<Tickets> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Tickets> tickets) {
		this.tickets = tickets;
	}

	public Set<Participants> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Participants> participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "Entertainments [serialId=" + serialId + ", name=" + name + ", type=" + type 
				+ ", tickets=" + tickets + ", participants=" + participants + "]";
	}
	
	
}
