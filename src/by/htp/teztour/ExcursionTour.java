package by.htp.teztour;

public class ExcursionTour extends Tour {

	private double guidePayment;
	private int numberOfTourists;

	public ExcursionTour(String name, int numberOfDays, int price, int prepayment, double guidePayment,
			int numberOfTourists) {
		super(name, numberOfDays, price, prepayment);
		this.guidePayment = guidePayment;
		this.numberOfTourists = numberOfTourists;

	}

	@Override
	public void calculatePrepayment() {

		super.calculatePrepayment();
	}

	public void calculateGuidePayment() {

		guidePayment = numberOfTourists * 2;
		System.out.println("The price for guide equals to: " + guidePayment);

	}



	}


