package com.vnrits.quizz.quizz_app;

public class UnauthorisedException extends Exception {

	int i;
	String error;
	String message;
	public UnauthorisedException(int i, String error, String message) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.error=error;
		this.message=message;
	}

}
