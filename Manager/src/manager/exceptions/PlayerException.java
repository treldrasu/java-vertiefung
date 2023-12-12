package manager.exceptions;

import java.util.List;

import manager.a2.Spieler;

public class PlayerException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlayerException(String e) {
		super(e);
	}

	public static int alterValide(int alter) throws PlayerException {
		if (alter <= 0)
			throw new PlayerException("Alter: " + alter + " ist <= 0");
		return alter;
	}
}
