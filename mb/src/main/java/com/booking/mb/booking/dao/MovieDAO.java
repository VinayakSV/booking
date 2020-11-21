package com.booking.mb.booking.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.booking.mb.booking.Repository.MovieRepository;
import com.booking.mb.booking.common.DTOMapper;
import com.booking.mb.booking.dto.MovieDTO;
import com.booking.mb.booking.model.Movie;

@Component
public class MovieDAO {

	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	DTOMapper dtoMapper;
	
	
	public Movie save(MovieDTO movieDTO) {
		
		return movieRepository.save(dtoMapper.mapMovie(movieDTO));
	}
	
	public List<MovieDTO> findAll(){
		List<Movie> movies = movieRepository.findAll();
		return dtoMapper.mapMoviesToDTO(movies);
	}
	
}
