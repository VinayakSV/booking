package com.booking.mb.sample.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleJob {
	
	private static final Logger LOG = LoggerFactory.getLogger(SampleJob.class);

	public void cronJob() {
		LOG.info("sample job test...");
	}
}
