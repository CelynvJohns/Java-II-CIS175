package model;

public class CoinConverter {
	private int cents;
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;

	public CoinConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoinConverter(int cents) {
		super();
		this.cents = cents;
		setCoins(cents);
		// NOTICE THIS METHOD CALL
	}

	public void setCents(int cents) {
		this.cents = cents;
		setCoins(cents);
		// NOTICE THIS METHOD CALL
	}

	// OTHER GETTERS & SETTERS FOR INSTANCE VARIABLES
	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public int getCents() {
		return cents;
	}


	public void setCoins(int cents) {
		final int DOLLARS = 100; // number of cents in dollar
		final int QUARTERS = 25; // number of cents in a quarter
		final int DIMES = 10; // number of cents in a dime
		final int NICKELS = 5; // number of cents in a nickel

		int centsLeft;
		
		setDollars(cents / DOLLARS);
		centsLeft = cents % DOLLARS;
		
		setQuarters(centsLeft / QUARTERS);
		centsLeft = centsLeft % QUARTERS;
		
		setDimes(centsLeft / DIMES);
		centsLeft = centsLeft % DIMES;
		
		setNickels(centsLeft / NICKELS);
		setPennies(centsLeft % NICKELS);
	}

	
	@Override
	public String toString() {
		return "CoinConverter [cents=" + cents + ", dollars=" + dollars + ", quarters=" + quarters + ", dimes=" + dimes
				+ ", nickels=" + nickels + ", pennies=" + pennies + "]";
	}
}
