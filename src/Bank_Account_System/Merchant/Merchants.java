package Bank_Account_System.Merchant;

public class Merchants {
    private int Merchant_ID;
    private String Merchant_name;
    private int Merchants_phone;
    private String Merchants_email;
    private String other_details;

    public int getMerchant_ID() {
        return Merchant_ID;
    }

    public void setMerchant_ID(int merchant_ID) {
        Merchant_ID = merchant_ID;
    }

    public String getMerchant_name() {
        return Merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        Merchant_name = merchant_name;
    }

    public int getMerchants_phone() {
        return Merchants_phone;
    }

    public void setMerchants_phone(int merchants_phone) {
        Merchants_phone = merchants_phone;
    }

    public String getMerchants_email() {
        return Merchants_email;
    }

    public void setMerchants_email(String merchants_email) {
        Merchants_email = merchants_email;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }
}
