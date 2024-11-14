package modul;

public class Ticket {
	private String ticketID;
	private String seatNumber;
	private ClassType classType;
	private TicketStatus status;
	private double price;

	public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price) {
		this.ticketID = ticketID;
		this.seatNumber = seatNumber;
		this.classType = classType;
		this.status = status;
		this.price = price;
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String printTicket() {
//		Print ticket tidak akan menampilkan id tiket
		return "Seat Number: " + getSeatNumber() +
				"Class Type: " + getClassType() +
				"Status Ticket: " + getTicketStatus() +
				"Price: " + getPrice();
	}

	public String getTicketStatus() {
		if (status == TicketStatus.PAID) {
			return "Success";
		}
		if (status == TicketStatus.CANCELED) {
			return "Cancel";
		}
		return "Waiting to Pay";
	}
}
