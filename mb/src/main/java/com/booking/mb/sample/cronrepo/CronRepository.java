package com.booking.mb.sample.cronrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.mb.sample.model.CronJob;

public interface CronRepository extends JpaRepository<CronJob, Integer> {

	public CronJob findByName(String name);
}
