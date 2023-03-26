package edu.alumini.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.alumini.dto.AlumniDTO;
import edu.alumini.entity.Alumni;
import edu.alumini.exception.UserNotFoundException;
import edu.alumini.repository.AlumniRepository;
import edu.alumini.service.AlumniService;

@Service
public class AlumniServiceimpl implements AlumniService 
{
     // constructor injection 
	@Autowired
	private AlumniRepository alumniRepository;
	
	@Override
	public List<Alumni> getAllAlumni() {
		return alumniRepository.findAll();
	}

	@Override
	public Alumni createAlumni(AlumniDTO alumniDTO) {
		Alumni alumni=Alumni.builder().name(alumniDTO.getName()).email(alumniDTO.getEmail()).phone(alumniDTO.getPhone()).gYear(alumniDTO.getGYear()).build();
		return alumniRepository.save(alumni);
	}

	@Override
	public Alumni updateAlumni(int id,AlumniDTO alumnitDTO) //throws UserNotFoundException
	{
		Optional<Alumni> sdata= alumniRepository.findById(id);
		if(sdata.isEmpty()) {
			Alumni _alumni = alumniRepository.findById(id).get();
			_alumni.setName(alumnitDTO.getName());
			_alumni.setPhone(alumnitDTO.getPhone());
			_alumni.setEmail(alumnitDTO.getEmail());
			_alumni.setGYear(alumnitDTO.getGYear());
			
			return alumniRepository.save(_alumni);
		}
		
	else throw new UserNotFoundException("No user bearing id"+id+"can be found");
	}

	public Alumni getAlumniById(int id) 
	{
		return alumniRepository.findById(id).orElseThrow(()->new UserNotFoundException("No User hearing id"+id+"can be found"));
	}

	@Override
	public List<Alumni> findByNameContaining(String name) throws UserNotFoundException
	{
		if(alumniRepository.findByNameContaining(name).isEmpty())
			throw new UserNotFoundException("No User bearing"+name+"can be found");
		else
			return alumniRepository.findByNameContaining(name);
	}

	@Override
	public List<Alumni> findByGYearContaining(String gYear) 
	{
		if(alumniRepository.findByGYear(gYear).isEmpty())
			throw new UserNotFoundException("No student with graduation "+gYear+"can be found");
		else
		    return alumniRepository.findByGYear(gYear);
	}

	public String deleteAlumni1(int id) 
	{
		alumniRepository.deleteById(id);
		return "Alumni bearing id"+id+"has been deleted successfully..............";
	
}

	@Override
	public String deleteAlumni(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}