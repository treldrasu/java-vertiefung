package manager.exceptions;

import manager.end.Trainer;

public class PlayerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlayerException(String e) {
		super(e);
	}

	public static int alterValide(int alter, Object object) throws PlayerException {
		if (alter <= 0 && object instanceof Trainer)
			throw new PlayerException("Alter: " + alter + " ist <= 0");
		return alter;
	}
}
