package com.booking.mb.booking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cast")
public class Cast implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = -5124453595274911995L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "dob")
	private Date dob;

	@Column(name = "image_path")
	private String imagePath;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	private Movie movie;

}
