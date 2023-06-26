package pharmacy.designPatterns.FactoryPattern;

public class CustomerFactory  {
    public static Customer getCustomer(String customerType) {
        if (customerType == null) {
            return null;
        }
        if (customerType.equalsIgnoreCase("Pharmacy")) {
            return new PharmacyCustomer();
        } else if (customerType.equalsIgnoreCase("Hospital")) {
            return new HospitalCustomer();
        }
        return null;
    }
}
