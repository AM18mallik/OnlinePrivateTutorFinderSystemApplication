package com.optfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optfs.entity.Admin;
import com.optfs.entity.Tutor;
import com.optfs.exception.NullEmailFoundException;
import com.optfs.exception.NullUserFound;
import com.optfs.repository.AdminRepository;
import com.optfs.repository.TutorRepository;
import com.optfs.service.AdminService;
import com.optfs.service.TutorService;

@SpringBootTest
class AdminTest {
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	AdminService adminService;
	
	
	
	@Test
	void saveAdminWithNoEmail() throws NullEmailFoundException {
		Admin a = new Admin(001,"Test","User","","pass@123");
		
		assertThrows(NullEmailFoundException.class, () -> adminService.registerAdmin(a) );
				
	}
	
	@Test
	void getAdminById() throws NullUserFound {
		
		assertThrows(NullUserFound.class, () -> adminService.getAdminById(0) );
				
	}
	
	@Test
	void updateAdmin() throws NullUserFound {
		Admin a = new Admin(000,"Test","User","","pass@123");
		
		
		assertThrows(NullUserFound.class, () -> adminService.updateAdmin(a));
				
	}
	
	@Test
	void deleteAdmin() throws NullUserFound {
		Admin a = new Admin(001,"Test","User","","pass@123");
		
		
		assertThrows(NullUserFound.class, () -> adminService.deleteAdmin(a));
				
	}
	



}