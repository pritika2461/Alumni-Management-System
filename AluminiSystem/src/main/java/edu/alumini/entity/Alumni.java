package edu.alumini.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "alumnitable")

public class Alumni 
{
	     @Id
	     @GeneratedValue(strategy = GenerationType.AUTO)
	     
	     @Column(name = "sId")
	     private Integer id;
	     
	     @Column(name = "sName", length = 30)
	     private String name;
	     
	     @Column(name = "sPhone", length = 10)
	     private long phone;
	     
	     @Column(name = "sEmail", length = 30)
	     private String email;
	     
	     @Column(name = "sGYear", length = 4)
	     private String gYear;
	     
}
