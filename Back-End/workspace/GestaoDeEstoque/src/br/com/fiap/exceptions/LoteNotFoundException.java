package br.com.fiap.exceptions;

public class LoteNotFoundException extends Exception {

	public LoteNotFoundException() {
		super();
	}

	public LoteNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LoteNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoteNotFoundException(String message) {
		super(message);
	}

	public LoteNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
