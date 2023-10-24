package com.foodWaste.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orgaDetails")
public class Organization_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int organization_id;	
private String organization_name;
private String organization_owner_name;
private int organization_number;
private String organization_email_id;
private String organization_password;


public int getOrganization_id() {
	return organization_id;
}
public void setOrganization_id(int organization_id) {
	this.organization_id = organization_id;
}
public String getOrganization_name() {
	return organization_name;
}
public void setOrganization_name(String organization_name) {
	this.organization_name = organization_name;
}
public String getOrganization_owner_name() {
	return organization_owner_name;
}
public void setOrganization_owner_name(String organization_owner_name) {
	this.organization_owner_name = organization_owner_name;
}
public int getOrganization_number() {
	return organization_number;
}
public void setOrganization_number(int organization_number) {
	this.organization_number = organization_number;
}
public String getOrganization_email_id() {
	return organization_email_id;
}
public void setOrganization_email_id(String organization_email_id) {
	this.organization_email_id = organization_email_id;
}
public String getOrganization_password() {
	return organization_password;
}
public void setOrganization_password(String organization_password) {
	this.organization_password = organization_password;
}




}
