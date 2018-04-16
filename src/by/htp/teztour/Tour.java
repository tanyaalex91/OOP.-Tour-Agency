package by.htp.teztour;

public abstract class Tour {

	protected String name;
	protected int numberOfDays;
	protected double price;
	protected double prepayment;

	public Tour(String name, int numberOfDays, int price, int prepayment) {
		this.name = name;
		this.numberOfDays = numberOfDays;
		this.price = price;
		this.prepayment = prepayment;

	}

	public void calculatePrepayment() {
		if (numberOfDays>14&&price>2000) {
			prepayment = price*40/100;
		}
		else {
			prepayment = price*10/100;
		}

		System.out.println("Prepayment for the tour " + name + " equals to "+ prepayment);
	}

}
