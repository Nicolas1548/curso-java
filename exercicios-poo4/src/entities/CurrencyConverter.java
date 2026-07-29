package entities;

public class CurrencyConverter {

	public double dollarNeed;
	public double dollar;
	double iof = 1 + 0.06;

	public double Result() {
		return (dollar * dollarNeed) * iof;

	}
}
