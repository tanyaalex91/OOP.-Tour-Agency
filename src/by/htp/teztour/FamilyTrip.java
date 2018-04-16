package by.htp.teztour;

public class FamilyTrip extends Tour implements DedicatedTourAgent{
	private double extraBonus;

	public FamilyTrip(String name, int numberOfDays, int price, int prepayment, double extraBonus) {
		super(name, numberOfDays, price, prepayment);
		this.extraBonus = extraBonus;
	}

	@Override
	public void calculatePrepayment() {
		if (numberOfDays>14&&price>2000) {
			prepayment = price*40/100-extraBonus;
		}
		else {
			prepayment = price*10/100;
		}
		System.out.println("Prepayment for the tour " + name + " equals to "+ prepayment);
	}

	@Override
	public void assignAgent() {
		
		if(numberOfDays>10) {
			System.out.println("Your agent for the tour" + name+ "is Olga Orlovich");
		}
		else if(numberOfDays<10) {
			System.out.println("Your agent for the tour" + name+ "is Pasha Demkov");
		}
		else {
			System.out.println("Your agent for the tour" + name+ "is Vasiliy Kirillov");
		}
	}

}
