package view;

import controller.RevenueController;
import modul.DataDummy;

public class TrainReservationSystem {
	public static void main(String[] args) {
		DataDummy.createDummy();
		System.out.println("Total Revenue: " + RevenueController.calculateTotalRevenue());
	}
}
