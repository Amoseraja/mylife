package com.bookstore.servie;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.detail;
import com.bookstore.dto.adddto;
import com.bookstore.dto.addstudentdto;
import com.bookstore.repo.detailrepo;



@Service
public class deatailserive {
    @Autowired
	private detailrepo detailRepository;
	public detail findByUsernameAndPassword(String username, String password) {
        return detailRepository.findByUsernameAndPassword(username, password);
    }
	
//	 public void saveUser(detail user) {
//		 detailRepository.save(user);
//	    }
//
//	    public Optional<detail> findById(Long id) {
//	        return detailRepository.findById(id);
//	    }
	    
	    public void save(adddto registrationDto) {
	    	detail  user = new detail ();
	        user.setPythonprogram(registrationDto.getPythonprogram());
	        user.setJavaprogram(registrationDto.getJavaprogram());
	        user.setSpringbootprogram(registrationDto.getSpringbootprogram());
	        user.setSpringprogram(registrationDto.getSpringprogram());
	        user.setMysql(registrationDto.getMysql());
	        user.setReactjs(registrationDto.getReactjs());
	        user.setUsername(registrationDto.getUsername());
	        user.setUnivereid(registrationDto.getUnivereid());
	        user.setCousefee(registrationDto.getCousefee());
	        user.setPassword((registrationDto.getPassword()));
	        user.setEmail(registrationDto.getEmail());
	        user.setDob(registrationDto.getDob());
	        user.setDepartment(registrationDto.getDepartment());
	        user.setSemester(registrationDto.getSemester());
	        user.setGender(registrationDto.getGender());
	        user.setCourseName(registrationDto.getCourseName());
	        user.setRole(registrationDto.getRole());
	        user.setAttendce(registrationDto.getAttendce());
	        user.setName(registrationDto.getName());
	        detailRepository.save(user);
	    }
	    public void save(addstudentdto registrationDto1) {
	    	detail  user = new detail ();
	      
	        user.setUsername(registrationDto1.getUsername());
	        user.setUnivereid(registrationDto1.getUnivereid());
	       
	        user.setPassword(registrationDto1.getPassword());
	        user.setEmail(registrationDto1.getEmail());
	        user.setDob(registrationDto1.getDob());
	        user.setDepartment(registrationDto1.getDepartment());
	        user.setSemester(registrationDto1.getSemester());
	        user.setGender(registrationDto1.getGender());
	        user.setCourseName(registrationDto1.getCourseName());
	        user.setRole(registrationDto1.getRole());
	        user.setAttendce(registrationDto1.getAttendce());
	        user.setName(registrationDto1.getName());
	        user.setSalary(registrationDto1.getSalary());
	        detailRepository.save(user);
	    }
	   
	    
}
