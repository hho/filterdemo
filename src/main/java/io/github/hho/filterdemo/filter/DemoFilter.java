package io.github.hho.filterdemo.filter;

import io.github.hho.filterdemo.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

@Component // <-- this is found via @ComponentScan
public class DemoFilter extends GenericFilterBean {

	private static final Logger logger = LoggerFactory.getLogger(DemoFilter.class);

	@Autowired
	private DemoBean demoBean;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		logger.info("Executing the demo filter for request {} at {}!", req.getRequestURI(), demoBean.now());

		chain.doFilter(request, response);

	}
}
