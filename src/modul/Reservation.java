package modul;

import java.util.Date;

public class Reservation {
	String reservationID;
	Date reservationDate;

	public Reservation(String reservationID, Date reservationDate) {
		this.reservationID = reservationID;
		this.reservationDate = reservationDate;
	}

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String reserveSeat() {
		return "";
	}

	public String cancelReservation() {
		return "";
	}
}
