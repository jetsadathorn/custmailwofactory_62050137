package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        if (type.equals("1")) {
            return new RegularCustomer();
        }
        else if (type.equals("2")) {
            return new MountainCustomer();
        }
        else if (type.equals("3")) {
            return new DelinquentCustomer();
        }
        return null;
    }
}