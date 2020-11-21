package com.booking.mb.booking.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

	private String name;
	private Date releaseDate;
	private String totalHour;
	private String type;
	private String releaseStatus;
	private String description;
	
	List<CastDTO> castDTOs;
	List<CrewDTO> crewDTOs;
}
