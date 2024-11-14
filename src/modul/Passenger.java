package modul;

public class Passenger {
	String passengerID;
	String passengerName;
	String passengerGender;
	String passengerAge;

	public Passenger(String passengerID, String passengerName, String passengerGender, String passengerAge) {
		this.passengerID = passengerID;
		this.passengerName = passengerName;
		this.passengerGender = passengerGender;
		this.passengerAge = passengerAge;
	}

	public String getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public String getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(String passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerInfo() {
		return "";
	}
}
