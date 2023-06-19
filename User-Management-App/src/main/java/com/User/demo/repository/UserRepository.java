package com.User.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.demo.model.UserDtls;

@Repository
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public interface UserRepository  extends JpaRepository<UserDtls,Integer>{

	public boolean existsByEmail(String email);
	
	public UserDtls findByEmail(String email);
    
	public UserDtls findByEmailAndMobileNumber(String email,String Mob_No);
     //findByEmailAndmobileNumber for reset password

}
