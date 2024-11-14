package modul;

public class OnlinePayment implements Payment {
	private String transactionID;
	private String paymentGateaway;

	public OnlinePayment(String transactionID, String paymentGateaway) {
		this.transactionID = transactionID;
		this.paymentGateaway = paymentGateaway;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getPaymentGateaway() {
		return paymentGateaway;
	}

	public void setPaymentGateaway(String paymentGateaway) {
		this.paymentGateaway = paymentGateaway;
	}

	@Override
	public double makePayment(double amount) {
		return 0;
	}
}
