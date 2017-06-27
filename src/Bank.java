
public abstract class Bank {

	private String name;
	private double interestRate;
	
	public Bank(String name, double interestRate) {
		this.setName(name);
		this.setInterestRate(interestRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public abstract void withdraw();
	public abstract void deposit();
	
}
