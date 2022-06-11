public class lab3 {
    public static void main(String[] args) {
        //create an account object with an account
        //id of 1222, and a balance of rs 20,000
        Account account = new Account(1222, 20000);
        //set annual interest rate of 4.5%
        account.setAnnualInterestRate(4.5);
        //withdraw rs 2000
        account.withdraw(2500);
        //deposit 5000
        account.deposit(3000);

        //display the balance , the monthly interest
        System.out.println("     Account Statement ");
        System.out.println("---------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());

    }
}
