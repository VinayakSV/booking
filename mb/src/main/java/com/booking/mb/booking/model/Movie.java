package com.booking.mb.booking.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.Nullable;

import lombok.Data;
	
@Data
@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	/**
	 * it is an unique object stored
	 */
	private static final long serialVersionUID = -662004981276905563L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Nullable
	@Temporal(TemporalType.DATE)
	@Column(name = "release_date")
	private Date releaseDate;
	
	@Nullable
	@Column(name = "total_hour")
	private String totalHour;
	
	@Nullable
	@Column(name = "type")
	private String type;
	
	@Nullable
	@Column(name = "release_status")
	private String releaseStatus;
	
	@Nullable
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private List<Cast> casts;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private List<Crew> crews;
}
