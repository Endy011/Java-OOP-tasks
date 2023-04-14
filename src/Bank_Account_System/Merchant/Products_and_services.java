package Bank_Account_System.Merchant;

public class Products_and_services {
    private String Products_and_services_code;
    private String Products_and_services_description;
    private int Merchant_ID;

    public String getProducts_and_services_code() {
        return Products_and_services_code;
    }

    public void setProducts_and_services_code(String products_and_services_code) {
        Products_and_services_code = products_and_services_code;
    }

    public String getProducts_and_services_description() {
        return Products_and_services_description;
    }

    public void setProducts_and_services_description(String products_and_services_description) {
        Products_and_services_description = products_and_services_description;
    }

    public int getMerchant_ID() {
        return Merchant_ID;
    }

    public void setMerchant_ID(int merchant_ID) {
        Merchant_ID = merchant_ID;
    }
}
