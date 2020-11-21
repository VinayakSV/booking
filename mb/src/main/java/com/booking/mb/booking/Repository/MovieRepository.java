package com.booking.mb.booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.mb.booking.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}
