package controller;

import modul.*;

public class RevenueController {
	public static double calculateTotalRevenue() {
		double total = 0;
		for (Train train : DataDummy.getTrainTicket().keySet()) {
			System.out.println("baru ngeh gamungkin pake hashmap karena gabole double key :')");
		}
		return total;
	}
}
