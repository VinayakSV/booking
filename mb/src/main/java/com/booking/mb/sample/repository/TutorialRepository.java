package com.booking.mb.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.mb.sample.model.Tutorial;


public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	
	List<Tutorial> findByPublished(boolean piblished);
	List<Tutorial> findByTitleContaining(String title);

}
