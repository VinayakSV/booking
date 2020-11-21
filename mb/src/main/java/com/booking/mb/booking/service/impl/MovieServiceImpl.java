package com.booking.mb.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.mb.booking.common.DTOMapper;
import com.booking.mb.booking.dao.MovieDAO;
import com.booking.mb.booking.dto.MovieDTO;
import com.booking.mb.booking.model.Movie;
import com.booking.mb.booking.service.IMovieService;

@Service
public class MovieServiceImpl implements IMovieService{
	
	@Autowired
	MovieDAO movieDAO;

	@Override
	public MovieDTO save(MovieDTO movieDTO) {
		return new DTOMapper().mapFromObject(movieDAO.save(movieDTO));
	}

	@Override
	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieDTO> findAll() {
		return movieDAO.findAll();
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
