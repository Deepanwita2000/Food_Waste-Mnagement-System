package com.foodWaste.entity;

import java.sql.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Entity
@Table(name="postDetails")
public class Post_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int post_id;
	
	@NotNull(message="enter the foodtype")
	private String food_type;
	
	@NotNull(message="enter the postDate")
	private Date post_date;
	
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinColumn(name="donor_id",referencedColumnName = "donor_id")
	private Donor_Entity de ;




}
