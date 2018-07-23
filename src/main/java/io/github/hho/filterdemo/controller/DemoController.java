package io.github.hho.filterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // <-- this contains @Controller, which contains @Component
public class DemoController {

	@GetMapping(value = "/")
	public String helloWorld() {
		return "Hello, World!";
	}
}
