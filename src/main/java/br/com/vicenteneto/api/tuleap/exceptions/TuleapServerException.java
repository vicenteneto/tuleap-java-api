package br.com.vicenteneto.api.tuleap.exceptions;

public class TuleapServerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4991901531451402986L;

	public TuleapServerException(String message) {
		super(message);
	}

	public TuleapServerException(Throwable throwable) {
		super(throwable);
	}

}
