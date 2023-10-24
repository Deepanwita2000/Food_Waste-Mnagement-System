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

import com.foodWaste.entity.Organization_Entity;
import com.foodWaste.service.OrganizationService;



@RestController
public class OrganizationController {
	@Autowired
	OrganizationService os;
	
	@PostMapping("/addorganizationname")
	public Organization_Entity addorganizationname(@RequestBody Organization_Entity orga  ) {
						return os.addorganizationname(orga);
	}
	
	
	@GetMapping("/getorganizationname")
    public List<Organization_Entity> getAllorga() {
	 	       return os.fetchAllOrganization_Entity();
    }
    
    
    @GetMapping("/getorganizationname/{id}") //localhost:8080/getPatient/5
	  public Organization_Entity getorganizationnameById(@PathVariable("organization_id")int organization_id)
	  {
		  		  return os.getOrganizationById(organization_id);
	  }
    
    @PutMapping("/organizationname/{id}")
    public Organization_Entity updateorganizationname(@PathVariable("organization_id") int organization_id, @RequestBody Organization_Entity orga) {
    	return os.upadteOrganizationById(organization_id, orga);
         }
  
  @DeleteMapping("/organizationname/{id}")
  public String deleteorganizationname(@PathVariable("organization_id") int organization_id) {
	return os.deletePatientById(organization_id);
	   }
}
