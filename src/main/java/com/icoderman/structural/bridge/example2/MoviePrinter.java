package com.icoderman.structural.bridge.example2;

import java.util.List;

public class MoviePrinter extends Printer {

	private Movie movie;

	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}

	@Override
	protected List<Detail> getDetails() {
		return null;
	}

	@Override
	protected String getHeader() {
		return null;
	}
}
