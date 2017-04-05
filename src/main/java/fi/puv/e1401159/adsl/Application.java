package fi.puv.e1401159.adsl;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.puv.e1401159.adsl.model.Wifi;
import fi.puv.e1401159.adsl.repository.WifiRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(WifiRepository repository) {
		return (args) -> {
			Wifi w = new Wifi();
			w.setCrypt(1);
			Instant instant = Instant.now(); //fix timezone
			ZoneId zoneId = ZoneId.of("Europe/Helsinki");
			ZonedDateTime zdt = ZonedDateTime.ofInstant( instant , zoneId );
			w.setTimestamp(new Timestamp(zdt.toInstant().getEpochSecond() * 1000L));	  			
			repository.save(w);
			
			
		};
	}
	
}