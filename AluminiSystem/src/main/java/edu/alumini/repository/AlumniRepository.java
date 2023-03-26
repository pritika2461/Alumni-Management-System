package edu.alumini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.alumini.entity.Alumni;

public interface AlumniRepository  extends JpaRepository <Alumni, Integer>
{
      List<Alumni> findByNameContaining(String name);
      List<Alumni> findByGYear(String gYear);
}
