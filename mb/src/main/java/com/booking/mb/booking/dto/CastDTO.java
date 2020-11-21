package com.booking.mb.booking.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CastDTO {

	private String name;
	private String email;
	private Date dob;
	private String imagePath;
	
	
}
