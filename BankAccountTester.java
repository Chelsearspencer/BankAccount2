
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
bankAccountClass nina = new bankAccountClass("Nina Master",0001,1000);
checkingAccount john = new checkingAccount("John smith",0002,500);
savingsAccount amy = new savingsAccount("Amy Smith",0003,1500,.035);
		
		System.out.println(nina.toString());
		System.out.println(john.toString());
		System.out.println(amy.toString());
		
john.Deposit(10000);
john.MonthEnd(15);
amy.Withdraw(500);
amy.MonthEnd(20);

System.out.println();
double averageBalance = ((500*15)+(john.getBalance()*15))/30;
john.MonthEnd(averageBalance);
System.out.println(averageBalance);

amy.Withdraw(5000);
averageBalance = ((15000*20)+(10000*10))/30;
amy.MonthEnd(averageBalance);

System.out.println();
		System.out.println(nina.toString());
		System.out.println(john.toString());
		System.out.println(amy.toString());

	}

}