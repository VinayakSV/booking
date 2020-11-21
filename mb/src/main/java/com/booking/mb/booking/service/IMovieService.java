package com.booking.mb.booking.service;

import java.util.List;

import com.booking.mb.booking.dto.MovieDTO;
import com.booking.mb.booking.model.Movie;

public interface IMovieService {

public MovieDTO save(MovieDTO movieDTO);
	
	public Movie update(Movie movie);
	
	public List<MovieDTO> findAll();
	
	public String delete(Long id);
}
