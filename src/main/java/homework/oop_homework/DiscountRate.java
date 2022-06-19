package homework.oop_homework;

public class DiscountRate {

    public static double serviceDiscountPremium = 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;

    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String serviceDiscountRate) {
        switch (serviceDiscountRate) {
            case "Silver":
                return serviceDiscountSilver;
            case "Gold":
                return serviceDiscountGold;
            case "Premium":
                return serviceDiscountPremium;
            default:
                return 0;
        }
    }

    public static double getProductDiscountRate(String productDiscountRate) {
        switch (productDiscountRate) {
            case "Silver":
                return productDiscountSilver;
            case "Gold":
                return productDiscountGold;
            case "Premium":
                return productDiscountPremium;
            default:
                return 0;
        }

    }
}
