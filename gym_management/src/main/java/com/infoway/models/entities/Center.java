package com.infoway.models.entities;


import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="centers")
public class Center {

	 @Id
	 @GeneratedValue
	private Integer id;
	private String name;
	private String description;
	private String locality;
	private String address;
	private String contact;
	private Date created_at;
	private Date updated_at;
	private int ownerId;
	
	
	public Center() {	}

	
	public Center(Integer id, String name, String description, String locality, String address, String contact,
				  Date created_at, Date updated_at, Integer ownerId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.locality = locality;
		this.address = address;
		this.contact = contact;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.ownerId = ownerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
}