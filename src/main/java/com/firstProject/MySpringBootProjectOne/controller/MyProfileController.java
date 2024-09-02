package com.firstProject.MySpringBootProjectOne.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstProject.MySpringBootProjectOne.model.Profile;
import com.firstProject.MySpringBootProjectOne.repository.MyProfileRepository;

@RestController
public class MyProfileController {

	@Autowired
	private MyProfileRepository profileRepository;
	
	@PostMapping("/saveProfile")
	public String saveProfile(@RequestBody Profile profile) {
		profileRepository.save(profile);
		return "Profile Saved...";
	}
	
	@GetMapping("/getAllProfiles")
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
	}
	
	@PutMapping("/updateProfile")
	public Profile updateProfile(@RequestBody Profile profile) {
		return profileRepository.save(profile);
	}
	
	@DeleteMapping("/deleteProfile/{id}")
	public String deleteProfile(@PathVariable int id) {
		Optional<Profile> profile = profileRepository.findById(id);
		if (profile.isPresent()) {
			profileRepository.delete(profile.get());
			return "profile deleted...";
		} else {
			return "profile not present";
		}
	}
	
	@GetMapping("/getProfileById/{id}")
	public Profile getProfileById(@PathVariable int id) {
		Optional<Profile> profile = profileRepository.findById(id);
		if (profile.isPresent()) {
			return profile.get();
		} else {
			return null;
		}
	}
	
	@GetMapping("/getProfilesByDept/{dept_id}")
	public List<Profile> getProfilesByDepartment(@PathVariable("dept_id")String deptId) {
		return profileRepository.findByDept(deptId);
	}
}
