package modul;

import java.util.HashMap;

public class DataDummy {
	private static HashMap<Train, Ticket> trainTicket;
	public void createDummy() {
		trainTicket.put(new Train(1, "Train 1", TrainType.STANDARD), new Ticket("T001", "1A", ClassType.FIRST_CLASS, TicketStatus.PAID, 350000));
		trainTicket.put(new Train(2, "Train 2", TrainType.STANDARD), new Ticket("T004", "6B", ClassType.BUSINESS_CLASS, TicketStatus.CANCELED, 250000));
		trainTicket.put(new Train(3, "Train 3", TrainType.STANDARD), new Ticket("T007", "3C", ClassType.ECONOMY_CLASS, TicketStatus.PAID, 175000));
		trainTicket.put(new Train(4, "Train 4", TrainType.FASTTRAIN), new Ticket("T010", "4B", ClassType.FIRST_CLASS, TicketStatus.AWAITING_PAYMENT, 600000));
		trainTicket.put(new Train(5, "Train 5", TrainType.FASTTRAIN), new Ticket("T013", "5A", ClassType.BUSINESS_CLASS, TicketStatus.PAID, 500000));
		trainTicket.put(new Train(6, "Train 6", TrainType.FASTTRAIN), new Ticket("T016", "2C", ClassType.ECONOMY_CLASS, TicketStatus.PAID, 400000));
	}
}
