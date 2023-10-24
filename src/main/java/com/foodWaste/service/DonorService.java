package com.foodWaste.service;
import java.util.List;

import com.foodWaste.entity.Donor_Entity;
public interface DonorService {
	Donor_Entity adddonorname(Donor_Entity donor); // Insert
	List<Donor_Entity> fetchAllDonor_Entity(); // select
	Donor_Entity getDonorById(int donor_id); // select by id
	Donor_Entity upadteDonorById(int donor_id,Donor_Entity  donor); // Update
	String deletedonortById(int donor_id);
}
