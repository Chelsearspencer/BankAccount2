
public class bankAccountClass {

	private String name;
	private double accountNumber;
	private double balance;

public void setBalance(double balance) {
	this.balance = balance;
}
public void setName(String name) {
	this.name = name;
}
public void setAccountNumber(double accountNumber) {
	this.accountNumber = accountNumber;
}
public String getName() {
	return name;
}
public double getBalance() {
	return balance;
}
public double getAccountNumber() {
	return accountNumber;
}
public bankAccountClass(String name, double accountNumber, double balance) {
	this.name=name;
	this.accountNumber= accountNumber;
	this.balance= balance;
}
void Withdraw(double withdrawAmount) { 
   balance  = balance  - withdrawAmount;
}
void Deposit(double depositAmount) { 
   balance = balance + depositAmount;
}
public String toString() {
 return name+","+ accountNumber+","+balance;
}
}
