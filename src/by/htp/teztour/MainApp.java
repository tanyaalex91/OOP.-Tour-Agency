package by.htp.teztour;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		FamilyTrip familytrip = new FamilyTrip("Family Relax", 15, 3060, 0, 50);

		RoundTheWorldTour roundtheworld = new RoundTheWorldTour("Explore the world", 14, 2000, 0, "Discount for food",
				0.0);
		ExcursionTour excursion = new ExcursionTour("Around Vitebsk", 2, 200, 0, 0.0, 3);

		familytrip.calculatePrepayment();
		roundtheworld.calculateBonus();
		excursion.calculateGuidePayment();
		excursion.calculatePrepayment();

	}
}
