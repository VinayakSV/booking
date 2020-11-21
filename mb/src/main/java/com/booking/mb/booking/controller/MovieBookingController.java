package com.booking.mb.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.mb.booking.dto.MovieDTO;
import com.booking.mb.booking.service.IMovieService;

@RestController
@RequestMapping("/movie")
public class MovieBookingController {

	@Autowired
	IMovieService movieService;
	
	@PostMapping
	public ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movieDTO){
		
		return new ResponseEntity<MovieDTO>(movieService.save(movieDTO), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<MovieDTO>> getAllMovies(){
		return new ResponseEntity<>(movieService.findAll(), HttpStatus.OK);
	}
	
}
