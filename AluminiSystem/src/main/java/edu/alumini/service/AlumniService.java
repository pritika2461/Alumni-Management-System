package edu.alumini.service;

import java.util.List;


import edu.alumini.dto.AlumniDTO;
import edu.alumini.entity.Alumni;

public interface AlumniService 
{
	List<Alumni> getAllAlumni();
	
	Alumni createAlumni(AlumniDTO alumniDTO);
	
	Alumni updateAlumni(int id,AlumniDTO alumniDTO);
	
	Alumni getAlumniById(int id);
	
	List<Alumni> findByNameContaining(String name);
	
	List<Alumni> findByGYearContaining(String graduationYear);
	
	String deleteAlumni(int id);
	
	
}
