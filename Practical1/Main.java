package Practical1;
public class Main {
    public static void main(String[] args) {

        Account Ac = new Account(125, 15000);
        Ac.setAnnualInterestRate(8.5);
        Ac.withdraw(5000);
        Ac.deposit(3000);
        Ac.setDateCreated("2/10/2005");

        System.out.println("Balance: " + Ac.getBalance());
        System.out.println("Monthly Interest: " + Ac.getMonthlyInterest());
        System.out.println("Date Created: " + Ac.getDateCreated());

    }

}
