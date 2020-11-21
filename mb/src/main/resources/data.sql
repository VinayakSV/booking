--Spring Boot will automatically pick up the data.sql and run it against our configured H2 database during application startup. 
--This is a good way to seed the database for testing or other purposes.

DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');
  
DROP TABLE IF EXISTS cron_job;  
  
CREATE TABLE IF NOT EXISTS cron_job (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  cronexpr VARCHAR(250) NOT NULL
);

INSERT INTO cron_job (name, cronexpr) VALUES ('cron1', '0 0/1 15 * * *');

DROP TABLE IF EXISTS shedlock;

CREATE TABLE shedlock(
    name VARCHAR(64), 
    lock_until TIMESTAMP(3) NULL, 
    locked_at TIMESTAMP(3) NULL, 
    locked_by  VARCHAR(255), 
    PRIMARY KEY (name)
)