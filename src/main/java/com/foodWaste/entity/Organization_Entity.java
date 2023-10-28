package com.foodWaste.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="orgaDetails")
public class Organization_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int organization_id;
	
	@NotNull(message="enter the organization_name")
private String organization_name;
	
	@NotNull(message="enter the organization_owner_name")
private String organization_owner_name;
	
	@NotNull(message="enter the organization_number")
private int organization_number;
	
	@NotNull(message="enter the organization_email_id")
private String organization_email_id;
	
	@NotNull(message="enter the organization_password")
private String organization_password;



}
