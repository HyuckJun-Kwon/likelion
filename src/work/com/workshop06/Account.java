package work.com.workshop06;

public class Account {
    private String account;
    private int balance;
    private double interestRate;

    public Account() {
        this.account = "441-0290-1203";
        this.balance = 500000;
        this.interestRate = 7.3;
    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (balance - money < 0) {
            System.out.println("출금 할 수 없습니다.");
        } else {
            balance -= money;
        }
    }

    public String getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }
    
    public void accountInfo() {
        System.out.println("계좌번호 : " + account + " 잔액 : " + balance + "원 이자율 : " + interestRate + "%");
    }
    
    public void setInterestRate(double newRate) {
        this.interestRate = newRate;
    }
}

