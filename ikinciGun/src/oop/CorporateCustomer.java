package oop;

public class CorporateCustomer extends Customer{ //burada extends ile CorporateCustomerında bir Customer olduğunu ifade ettik.
    private String companyName;
    private String taxNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
