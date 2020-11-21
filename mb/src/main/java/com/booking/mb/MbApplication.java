package com.booking.mb;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.booking.mb.sample.cronrepo.CronRepository;
import com.booking.mb.sample.model.CronJob;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;

@SpringBootApplication
@EnableJpaRepositories({"com.booking.mb.sample.repository", "com.booking.mb.sample.cronrepo", "com.booking.mb.booking.Repository"})
@ComponentScan("com.booking.mb.*")
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "30s")
public class MbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbApplication.class, args);
	}
	
	@Autowired
	private CronRepository cronRepo;
	
	@Bean
	public String getCronValue()
	{
	    CronJob cronJob =  cronRepo.findByName("cron1");
	    
	    return cronJob.getCronexpr();
	}
	
	@Bean
    public LockProvider lockProvider(DataSource dataSource) {
        return new JdbcTemplateLockProvider(dataSource);
    }

}
