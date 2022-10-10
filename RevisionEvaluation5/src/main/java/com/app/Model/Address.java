package com.app.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@NotNull
	@Pattern(regexp = "{2,}")
	private String street;
	
	@NotNull
	@Pattern(regexp = "{2,}")
	private String city;
	
	@NotNull
	@Pattern(regexp = "{2,}")
	private String state;
	
	@NotNull
	@Pattern(regexp = "{2,}")
	private String country;
	

}
