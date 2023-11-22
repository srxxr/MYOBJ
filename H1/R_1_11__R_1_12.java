package H1;

public class R_1_11__R_1_12 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public R_1_11__R_1_12(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public R_1_11__R_1_12(String customer, String bk, String account, int limit) {
        this(customer, bk, account, limit, 0.0);
    }
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit)
            return false;
        balance += price;
        return true;
    }
    public void makePayment_12(double amount) { //Q..R_1_12
        if (amount < 0) {
            System.out.println("Your payment can not be negative :( ");
        } else
            balance -= amount;

    }

    public static void printSummary(R_1_11__R_1_12 card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

}
