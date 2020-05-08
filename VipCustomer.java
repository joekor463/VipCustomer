public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Ivan Ivanoff", 10000.00,"joker@gmail.ru");
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
