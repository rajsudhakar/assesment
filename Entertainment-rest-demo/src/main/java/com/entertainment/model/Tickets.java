package com.entertainment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Tickets {

	@Column(length = 20)
	private String ticketName;
	@Id
	@GeneratedValue(generator = "ticket_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "ticket_seq",sequenceName ="ticket_seq",initialValue = 10,allocationSize = 1 )
	private Integer ticketId;
	@Column(length = 20)
	private double price;
	 
	@OneToOne
	private Participants participans;
	
	@ManyToOne
	private Entertainments entertainments;

	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tickets(String ticketName, double price) {
		super();
		this.ticketName = ticketName;
		this.price = price;
	
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Participants getParticipans() {
		return participans;
	}

	public void setParticipans(Participants participans) {
		this.participans = participans;
	}

	public Entertainments getEntertainments() {
		return entertainments;
	}

	public void setEntertainments(Entertainments entertainments) {
		this.entertainments = entertainments;
	}

	@Override
	public String toString() {
		return "Tickets [ticketName=" + ticketName + ", ticketId=" + ticketId + ", price=" + price + ", participans="
				+ participans + ", entertainments=" + entertainments + "]";
	}
	
	
}
