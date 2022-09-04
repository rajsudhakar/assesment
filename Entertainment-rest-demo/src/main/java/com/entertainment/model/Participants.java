package com.entertainment.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Participants {

	@Column(length = 20)
    private String userName;
	@Id
	@GeneratedValue(generator = "participant_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "participant_seq",sequenceName = "participant_seq",initialValue = 10,allocationSize = 1)
	private Integer userId;
	@Column(length = 20)
	private String email;
	 
	@OneToOne
	private Tickets tickets;
	@ManyToMany
	private List<Entertainments> entertainments;
	
	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participants(String userName, String email, Tickets tickets) {
		super();
		this.userName = userName;
		this.email = email;
		this.tickets = tickets;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Tickets getTickets() {
		return tickets;
	}

	public void setTickets(Tickets tickets) {
		this.tickets = tickets;
	}

	public List<Entertainments> getEntertainments() {
		return entertainments;
	}

	public void setEntertainments(List<Entertainments> entertainments) {
		this.entertainments = entertainments;
	}

	@Override
	public String toString() {
		return "Participants [userName=" + userName + ", email=" + email + ", tickets=" + tickets + ", entertainments="
				+ entertainments + "]";
	}
	
	
	
	
}
