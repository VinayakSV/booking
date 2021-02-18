package com.booking.mb.booking.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.booking.mb.booking.dto.CastDTO;
import com.booking.mb.booking.dto.CrewDTO;
import com.booking.mb.booking.dto.MovieDTO;
import com.booking.mb.booking.model.Movie;

@Component
public class DTOMapper {
	
	//This is to check local repo works

	public MovieDTO mapFromObject(Movie movie) {

		MovieDTO movieDTO = new MovieDTO();
		movieDTO.setName(movie.getName());
		movieDTO.setDescription(movie.getDescription());
		movieDTO.setReleaseDate(movie.getReleaseDate());
		movieDTO.setReleaseStatus(movie.getReleaseStatus());
		movieDTO.setTotalHour(movie.getTotalHour());
		movieDTO.setType(movie.getType());
		if (movie.getCasts() != null) {
			movieDTO.setCastDTOs(movie.getCasts().stream()
					.map(cast -> new CastDTO(cast.getName(), cast.getEmail(), cast.getDob(), cast.getImagePath()))
					.collect(Collectors.toList()));
		}
		if (movie.getCrews() != null) {
			movieDTO.setCrewDTOs(movie.getCrews().stream()
					.map(crew -> new CrewDTO(crew.getName(), crew.getEmail(), crew.getDob(), crew.getImagePath()))
					.collect(Collectors.toList()));
		}

		return movieDTO;
	}

	public Movie mapMovie(MovieDTO movieDTO) {
		Movie movie = new Movie();
		movie.setName(movieDTO.getName());
		movie.setDescription(movieDTO.getDescription());
		movie.setReleaseDate(movieDTO.getReleaseDate());
		movie.setReleaseStatus(movieDTO.getReleaseStatus());
		movie.setTotalHour(movieDTO.getTotalHour());
		movie.setType(movieDTO.getType());

		return movie;
	}

	public List<MovieDTO> mapMoviesToDTO(List<Movie> movies) {
		return movies.stream()
				.map(movie -> new MovieDTO(movie.getName(), movie.getReleaseDate(), movie.getTotalHour(),
						movie.getType(), movie.getReleaseStatus(), movie.getDescription(),
						movie.getCasts().isEmpty() ? new ArrayList<CastDTO>()
								: movie.getCasts().stream()
										.map(cast -> new CastDTO(cast.getName(), cast.getEmail(), cast.getDob(),
												cast.getImagePath()))
										.collect(Collectors.toList()),

						movie.getCrews().isEmpty() ? new ArrayList<CrewDTO>()
								: movie.getCrews().stream()
										.map(crew -> new CrewDTO(crew.getName(), crew.getEmail(), crew.getDob(),
												crew.getImagePath()))
										.collect(Collectors.toList())))
				.collect(Collectors.toList());

	}

}
