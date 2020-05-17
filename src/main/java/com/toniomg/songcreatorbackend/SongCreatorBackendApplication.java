package com.toniomg.songcreatorbackend;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongCreatorBackendApplication {

	private static final Logger LOG = Logger.getLogger(SongCreatorBackendApplication.class.getName());

	public static void main(String[] args) {

		SpringApplication.run(SongCreatorBackendApplication.class, args);

		LOG.log(Level.INFO, "Started backend server");

	}

}
