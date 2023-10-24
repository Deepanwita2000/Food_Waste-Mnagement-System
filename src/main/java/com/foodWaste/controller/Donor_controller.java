package com.foodWaste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodWaste.entity.Donor_Entity;
import com.foodWaste.service.DonorService;

@RestController
public class Donor_controller {
	@Autowired
	DonorService ds;
	
	@PostMapping("/adddonorname")
	public Donor_Entity adddonorname(@RequestBody Donor_Entity donor  ) {
		
		return ds.adddonorname(donor);
	}
	
	
	@GetMapping("/getdonorname")
    public List<Donor_Entity> getAlldonor() {
	 	return ds.fetchAllDonor_Entity();
       
    }
    
    
    @GetMapping("/getdonorname/{id}") //localhost:8080/getPatient/5
	  public Donor_Entity getdonornameById(@PathVariable("donor_id")int donor_id)
	  {
		  return ds.getDonorById(donor_id);
	  }
    
    @PutMapping("/donorname/{id}")
    public Donor_Entity updatedonorname(@PathVariable("donor_id") int donor_id, @RequestBody Donor_Entity donor) {
	
      return ds.upadteDonorById(donor_id, donor) ; 
    }
  
  @DeleteMapping("/donorname/{id}")
  public String deletedonorname(@PathVariable("donor_id") int donor_id) {
	
	 return ds.deletedonortById(donor_id);
  }
}
