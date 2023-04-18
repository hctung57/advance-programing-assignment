import java.util.Date;

public class Account {
    private int ID;
    private  double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreate;

    public void Account(){
        this.dateCreate = new Date();
    }
    public void Account(int id, double balance){
        this.dateCreate = new Date();
        this.ID = id;
        this.balance = balance;
    }
    public int getID() {
        return ID;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getBalance() {
        return balance;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return this.balance*this.getMonthlyInterestRate();
    }
    public void withdraw(double money){
        if (this.balance >= money){
            this.balance -= money;
        }
    }
    public void deposit(double money){
        this.balance += money;
    }
}
