package Bank_Account_System.Customer;

import java.time.LocalDate;

public class Customers {
    private int Customers_ID;
    private String Customers_name;
    private int Customers_phone;
    private String Customers_email;
    private LocalDate date_became_customer;
    private String login;
    private String password;
    private String other_details;
    private int Customer_Types_code;

    public int getCustomers_ID() {
        return Customers_ID;
    }

    public void setCustomers_ID(int customers_ID) {
        Customers_ID = customers_ID;
    }

    public String getCustomers_name() {
        return Customers_name;
    }

    public void setCustomers_name(String customers_name) {
        Customers_name = customers_name;
    }

    public int getCustomers_phone() {
        return Customers_phone;
    }

    public void setCustomers_phone(int customers_phone) {
        Customers_phone = customers_phone;
    }

    public String getCustomers_email() {
        return Customers_email;
    }

    public void setCustomers_email(String customers_email) {
        Customers_email = customers_email;
    }

    public LocalDate getDate_became_customer() {
        return date_became_customer;
    }

    public void setDate_became_customer(LocalDate date_became_customer) {
        this.date_became_customer = date_became_customer;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public int getCustomer_Types_code() {
        return Customer_Types_code;
    }

    public void setCustomer_Types_code(int customer_Types_code) {
        Customer_Types_code = customer_Types_code;
    }
}
