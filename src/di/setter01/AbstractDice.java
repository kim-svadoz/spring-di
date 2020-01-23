package di.setter01;

import java.util.Random;

public class AbstractDice extends Random {

	public AbstractDice() {
		super();
	}

	public AbstractDice(long seed) {
		super(seed);
	}

	public int getDiceValue() {
		return nextInt(6)+1;
	}

}