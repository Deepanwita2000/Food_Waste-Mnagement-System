package com.foodWaste.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="donorDetails")
public class Donor_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int donor_id;
private String donor_name;
private int donor_number;
private String donor_email_id;
private String donor_location;
private String donor_password;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="donor_id",referencedColumnName = "donor_id")
private List<Post_Entity> pe ;


public int getDonor_id() {
	return donor_id;
}
public void setDonor_id(int donor_id) {
	this.donor_id = donor_id;
}
public String getDonor_name() {
	return donor_name;
}
public void setDonor_name(String donor_name) {
	this.donor_name = donor_name;
}
public int getDonor_number() {
	return donor_number;
}
public void setDonor_number(int donor_number) {
	this.donor_number = donor_number;
}
public String getDonor_email_id() {
	return donor_email_id;
}
public void setDonor_email_id(String donor_email_id) {
	this.donor_email_id = donor_email_id;
}
public String getDonor_location() {
	return donor_location;
}
public void setDonor_location(String donor_location) {
	this.donor_location = donor_location;
}
public String getDonor_password() {
	return donor_password;
}
public void setDonor_password(String donor_password) {
	this.donor_password = donor_password;
}





}
