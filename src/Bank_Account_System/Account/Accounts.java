package Bank_Account_System.Account;

import java.time.LocalDate;

public class Accounts {
    private int Account_ID;
    private String Accounts_name;
    private LocalDate date_opened;
    private String other_account_details;
    private int Account_Types_code;
    private int Customers_ID;

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int account_ID) {
        Account_ID = account_ID;
    }

    public String getAccounts_name() {
        return Accounts_name;
    }

    public void setAccounts_name(String accounts_name) {
        Accounts_name = accounts_name;
    }

    public LocalDate getDate_opened() {
        return date_opened;
    }

    public void setDate_opened(LocalDate date_opened) {
        this.date_opened = date_opened;
    }

    public String getOther_account_details() {
        return other_account_details;
    }

    public void setOther_account_details(String other_account_details) {
        this.other_account_details = other_account_details;
    }

    public int getAccount_Types_code() {
        return Account_Types_code;
    }

    public void setAccount_Types_code(int account_Types_code) {
        Account_Types_code = account_Types_code;
    }

    public int getCustomers_ID() {
        return Customers_ID;
    }

    public void setCustomers_ID(int customers_ID) {
        Customers_ID = customers_ID;
    }
}
