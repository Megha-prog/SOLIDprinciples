package org.example.ECommerce;

public class ECommerceFactory {
    public ECommerce getInstance(String Type){
        switch(Type){
            case "Alibaba" : {
                return new Alibaba();
            }
            case "Amazon" : {
                return new Amazon();
            }
            case "EBay" : {
                return new EBay();
            }
            case "Flipkart" : {
                return new Flipkart();
            }
            case "IndiaMart" : {
                return new IndiaMart();
            }
            default: return new NotListed();
        }
    }
}
