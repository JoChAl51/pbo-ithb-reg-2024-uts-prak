package modul;

public class Train {
	int trainNumber;
	int trainName;
	TrainType trainType;

	public Train(int trainNumber, int trainName, TrainType trainType) {
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.trainType = trainType;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getTrainName() {
		return trainName;
	}

	public void setTrainName(int trainName) {
		this.trainName = trainName;
	}

	public TrainType getTrainType() {
		return trainType;
	}

	public void setTrainType(TrainType trainType) {
		this.trainType = trainType;
	}

	public String getTrainDetails() {
		return null;
	}
}
