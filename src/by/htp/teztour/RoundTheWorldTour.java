package by.htp.teztour;

public class RoundTheWorldTour extends Tour implements DedicatedTourAgent{

	private String bonusName = "Discount for food";
	private double bonus;

	public RoundTheWorldTour(String name, int numberOfDays, int price, int prepayment, String bonusName, double bonus) {
		super(name, numberOfDays, price, prepayment);
		this.bonusName = bonusName;
		this.bonus = bonus;

	}

	@Override
	public void calculatePrepayment() {

		super.calculatePrepayment();
	}

	public void calculateBonus() {
		bonus = 0.05 * price;
		System.out.println("Your bonus for the tour " + "equals to" + name + bonus);
	}

	@Override
	public void assignAgent() {
		
		if(numberOfDays>10) {
			System.out.println("Your agent for the tour" + name+ "is Alex Goncharov");
		}
		else if(numberOfDays<10) {
			System.out.println("Your agent for the tour" + name+ "is Kostya Filipov");
		}
		else {
			System.out.println("Your agent for the tour" + name+ "is Ania Bolshevikova");
		}
	}
	
	
	
}
