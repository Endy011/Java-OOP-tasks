package Task2.five;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(12, "amogus", 'm');
        System.out.println(customer.toString());


        Account account = new Account(13, customer, 500);
        System.out.println(account.toString());
        account.deposit(200);
        System.out.println(account.getBalance());
        System.out.println(account.toString());
        account.withdraw(149);
        account.getCustomername();
        System.out.println(account.toString());
    }
}
