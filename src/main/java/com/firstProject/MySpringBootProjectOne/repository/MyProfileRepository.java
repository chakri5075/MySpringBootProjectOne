package com.firstProject.MySpringBootProjectOne.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstProject.MySpringBootProjectOne.model.Profile;

@Repository
public interface MyProfileRepository extends JpaRepository<Profile, Integer>{

	List<Profile> findByDept(String deptId);

}
