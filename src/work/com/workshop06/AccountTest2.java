package work.com.workshop06;

public class AccountTest2 {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account("221-0101-211" + (i + 1), 100000, 4.5);
        }
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].accountInfo();
        }
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].setInterestRate(3.7);
        }
        
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].accountInfo();
            System.out.println("이자 : " + (int)accounts[i].calculateInterest() + "원");
        }

	}

}
