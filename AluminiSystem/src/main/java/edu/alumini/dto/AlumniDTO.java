package edu.alumini.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AlumniDTO {

	@NotBlank(message = "Invalid name :Empty name")
	@NotNull(message = "Invalid Name : Name is Null")
	@Size(min = 3, max = 30, message= "Invalid Name : Must enter name between 3 to 25 charector")
	private String name;
	
	@NotBlank(message = "Invalid phone number :Empty number")
	@NotNull(message = "Invalid phone number : Phone number is Null")
	@Size(min = 3, max = 30, message= "Invalid phone number : Must enter 10 charector")
	private long phone;
	
	@NotBlank(message = "Invalid email :Empty email")
	@NotNull(message = "Invalid Name : Name is Null")
	@Size(min = 3, max = 30, message= "Invalid Name : Must enter name between 3 to 25 charector")
	private String email;
	
	@NotBlank(message = "Invalid name :Empty name")
	@NotNull(message = "Invalid Name : Name is Null")
	@Size(min = 3, max = 30, message= "Invalid Name : Must enter name between 3 to 25 charector")
	private String gYear;
	
	
	
}
