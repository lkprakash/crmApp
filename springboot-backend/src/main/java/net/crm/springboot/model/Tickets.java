package net.crm.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Tickets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "customer_id")
	private long customer_id;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "assigned_to")
	private String assigned_to;
	
	@Column(name= "created_at")
	private String created_at;
	
	@Column(name = "updated_at")
	private String updated_at;
	
	public Tickets() {
		
	}
	
	public Tickets(long customer_id, String subject, String description, String status, String assigned_to,
			String created_at, String updated_at) {
		super();
		this.customer_id = customer_id;
		this.subject = subject;
		this.description = description;
		this.status = status;
		this.assigned_to = assigned_to;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
