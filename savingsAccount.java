
public class savingsAccount extends bankAccountClass {

	double interestRate;

public savingsAccount(String name, double accountNumber, double balance,double interestRate) {
	super(name, accountNumber, balance);
	this.interestRate=interestRate;
	}
void MonthEnd(double averageDailyBalance) {

	Deposit(averageDailyBalance * interestRate);
}
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}
public double getInterestRate() {
	return interestRate;
}
public String toString() {
	String s=super.toString();
	return s+ ","+interestRate;

}}
