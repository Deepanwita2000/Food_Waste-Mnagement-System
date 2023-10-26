package com.foodWaste.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodWaste.Repository.OrganizationRepository;

import com.foodWaste.entity.Organization_Entity;
@Service
public class OrganizationImpl implements OrganizationService {
	@Autowired
	OrganizationRepository or;
	
	@Override
	public Organization_Entity addorganizationname(Organization_Entity organization) {
		
		return or.save(organization);
	}

	@Override
	public List<Organization_Entity> fetchAllOrganization_Entity() {
		List<Organization_Entity> allOrganization_Entity = or.findAll();
		return allOrganization_Entity;
	}

	@Override
	public Organization_Entity getOrganizationById(int organization_id) {
		Optional<Organization_Entity> organization = or.findById(organization_id);
		if (organization.isPresent()) {

			return organization.get();
		}
		return null;
		
	}

	@Override
	public Organization_Entity upadteOrganizationById(int Organization_Entity, Organization_Entity organization) {
		Optional<Organization_Entity> o1 = or.findById(Organization_Entity);
		
		if (o1.isPresent()) {
			
			Organization_Entity originalorga = o1.get();
			
			 if (Objects.nonNull(organization.getOrganization_name()) && !"".equalsIgnoreCase(organization.getOrganization_name())) {
				 originalorga.setOrganization_name(organization.getOrganization_name());
	            }
			 
			 if (Objects.nonNull(organization.getOrganization_owner_name()) && !"".equalsIgnoreCase(organization.getOrganization_owner_name())) {
				 originalorga.setOrganization_owner_name(organization.getOrganization_owner_name());;
	            }
			 
			 if (Objects.nonNull(organization.getOrganization_number()) && !(0==organization.getOrganization_number())) {
				 originalorga.setOrganization_number(organization.getOrganization_number());
	            }
			 
			 if (Objects.nonNull(organization.getOrganization_email_id()) && !"".equalsIgnoreCase(organization.getOrganization_email_id())) {
				 originalorga.setOrganization_email_id(organization.getOrganization_email_id());;
	            }
			 
			 if (Objects.nonNull(organization.getOrganization_password()) && !"".equalsIgnoreCase(organization.getOrganization_password())) {
				 originalorga.setOrganization_password(organization.getOrganization_password());
	            }
			 
			
			 
			return or.save(originalorga);
	            
			
		}
		return null;
	}

	@Override
	public String deletePatientById(int organization_id) {
		if(or.findById(organization_id).isPresent()) {
			or.deleteById(organization_id);
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	

}
