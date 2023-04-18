public class Main {
    public static void main(String[] args) {
        Account account = new Account(1012,20000000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(1500000);
        account.deposit(3000000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());
        System.out.println(account.getDateCreate());
    }
}