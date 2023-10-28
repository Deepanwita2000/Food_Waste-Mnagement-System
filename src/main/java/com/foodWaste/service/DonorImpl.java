package com.foodWaste.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.foodWaste.Repository.DonerRepository;
import com.foodWaste.entity.Donor_Entity;
@Service
public class DonorImpl implements DonorService {
	@Autowired
	DonerRepository dr;
	
	@Override
	public Donor_Entity adddonorname(Donor_Entity donor) {
		
		return dr.save(donor);
	}

	@Override
	public List<Donor_Entity> fetchAllDonor_Entity() {
		List<Donor_Entity> allDonor_Entity = dr.findAll();
		return allDonor_Entity;
	}

	@Override
	public Donor_Entity getDonorById(int donor_id) {
		Optional<Donor_Entity> donor = dr.findById(donor_id);
		if (donor.isPresent()) {

			return donor.get();
		}
		return null;
	}

	@Override
	public Donor_Entity upadteDonorById(int donor_id, Donor_Entity donor) {
		Optional<Donor_Entity> d1 = dr.findById(donor_id);
		
		if (d1.isPresent()) {
			
			Donor_Entity originaldonor = d1.get();
			
			 if (Objects.nonNull(donor.getDonor_name()) && !"".equalsIgnoreCase(donor.getDonor_name())) {
				 originaldonor.setDonor_name(donor.getDonor_name());
	            }
			 
			 if (Objects.nonNull(donor.getDonor_number()) && !(0==donor.getDonor_number())) {
				 originaldonor.setDonor_number(donor.getDonor_number());
	            }
			 
			 if (Objects.nonNull(donor.getDonor_email_id()) && !"".equalsIgnoreCase(donor.getDonor_email_id())) {
				 originaldonor.setDonor_email_id(donor.getDonor_email_id());
	            }
			 
			 if (Objects.nonNull(donor.getDonor_location()) && !"".equalsIgnoreCase(donor.getDonor_location())) {
				 originaldonor.setDonor_location(donor.getDonor_location());
	            }
			 
			 if (Objects.nonNull(donor.getDonor_password()) && !"".equalsIgnoreCase(donor.getDonor_password())) {
				 originaldonor.setDonor_password(donor.getDonor_password());
	            }
			 
			
			 
			return dr.save(originaldonor);
	            
			
		}
		return null;
	}

	@Override
	public String deletedonortById(int donor_id) {
		if(dr.findById(donor_id).isPresent()) {
			dr.deleteById(donor_id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	

}
