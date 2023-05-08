public class Staff extends Employee {
    private String rank;

    public Staff() {}

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary,  String startDate, String rank) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", office='" + getOffice() + '\'' +
                ", salary=" + getSalary() +
                ", startDate=" + getStartDate() +
                ", rank='" + rank;
    }
}