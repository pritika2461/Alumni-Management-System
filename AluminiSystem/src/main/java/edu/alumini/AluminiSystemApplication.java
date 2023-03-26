package edu.alumini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.alumini.entity.Alumni;
import edu.alumini.repository.AlumniRepository;


@SpringBootApplication
public class AluminiSystemApplication implements CommandLineRunner
{
	// constructor injection
    @Autowired
	private AlumniRepository alumniRepository;
	
    // Main Method
	public static void main(String[] args)
	{
		SpringApplication.run(AluminiSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
	     // adding dummy data 	
		Alumni a1=Alumni.builder().name("Pritika").phone(98763234).email("pritika@gmail.com").gYear("2023").build();
		Alumni a2=Alumni.builder().name("Priya").phone(987654324).email("priya@gmail.com").gYear("2021").build();
		Alumni a3=Alumni.builder().name("Prayal").phone(87654323).email("Priyal@gmail.com").gYear("2022").build();
		Alumni a4=Alumni.builder().name("Jaya").phone(98765432).email("jaya@gmail.com").gYear("2024").build();
		
		// saving the data 
		alumniRepository.save(a1);
		alumniRepository.save(a2);
		alumniRepository.save(a3);
		alumniRepository.save(a4);
		
		
		// Printing the message to save data
		System.out.println("---------------saved all----------------------------");
		
	}

}
