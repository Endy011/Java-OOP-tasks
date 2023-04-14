package Bank_Account_System.Customer;

import java.time.LocalDate;

public class Customer_Purchase {
    private int Purchase_ID;
    private LocalDate Date;
    private float Quantity;
    private String Other_details;
    private int Customers_ID;
    private String Product_and_services_code;

    public int getPurchase_ID() {
        return Purchase_ID;
    }

    public void setPurchase_ID(int purchase_ID) {
        Purchase_ID = purchase_ID;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public float getQuantity() {
        return Quantity;
    }

    public void setQuantity(float quantity) {
        Quantity = quantity;
    }

    public String getOther_details() {
        return Other_details;
    }

    public void setOther_details(String other_details) {
        Other_details = other_details;
    }

    public int getCustomers_ID() {
        return Customers_ID;
    }

    public void setCustomers_ID(int customers_ID) {
        Customers_ID = customers_ID;
    }

    public String getProduct_and_services_code() {
        return Product_and_services_code;
    }

    public void setProduct_and_services_code(String product_and_services_code) {
        Product_and_services_code = product_and_services_code;
    }
}
