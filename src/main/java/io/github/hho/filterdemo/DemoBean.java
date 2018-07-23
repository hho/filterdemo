package io.github.hho.filterdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class DemoBean {

	private static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

	public DemoBean() {
		logger.info("Constructing DemoBean");
	}

	public Instant now() {
		return Instant.now();
	}
}
