package io.github.hho.otherpackage;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Component // this will never be found, because this package is not scanned
public class FailingFilter extends GenericFilterBean {

	public FailingFilter() {
		throw new AssertionError("This will never run");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		throw new AssertionError("This will never run");

	}
}
