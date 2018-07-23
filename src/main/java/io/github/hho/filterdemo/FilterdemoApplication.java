package io.github.hho.filterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // <-- this annotation contains @ComponentScan; it scans this package and subpackages
public class FilterdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterdemoApplication.class, args);
	}
}
