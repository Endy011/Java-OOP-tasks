package Bank_Account_System.Transaction;

import java.time.LocalDate;

public class Transactions {
    private int Transaction_ID;
    private LocalDate date;
    private float amount_of_transaction;
    private String other_details;
    private int Purcahse_ID;
    private int Account_ID;
    private String Transaction_Types_code;

    public int getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(int transaction_ID) {
        Transaction_ID = transaction_ID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getAmount_of_transaction() {
        return amount_of_transaction;
    }

    public void setAmount_of_transaction(float amount_of_transaction) {
        this.amount_of_transaction = amount_of_transaction;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public int getPurcahse_ID() {
        return Purcahse_ID;
    }

    public void setPurcahse_ID(int purcahse_ID) {
        Purcahse_ID = purcahse_ID;
    }

    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int account_ID) {
        Account_ID = account_ID;
    }

    public String getTransaction_Types_code() {
        return Transaction_Types_code;
    }

    public void setTransaction_Types_code(String transaction_Types_code) {
        Transaction_Types_code = transaction_Types_code;
    }
}
