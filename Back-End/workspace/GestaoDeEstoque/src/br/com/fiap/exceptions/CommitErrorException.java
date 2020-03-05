package br.com.fiap.exceptions;

public class CommitErrorException extends Exception {

	public CommitErrorException() {
		super();
	}

	public CommitErrorException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CommitErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommitErrorException(String message) {
		super(message);
	}

	public CommitErrorException(Throwable cause) {
		super(cause);
	}
	
}
