package pharmacy.designPatterns.AbstractFactoryPattern;

public class PharmacyFactory extends AbstractFactory {
    @Override
    public Customers getCustomer(String customerType) {
        return null;
    }

    @Override
    public Address getAddress(String addressType) {
        if (addressType == null) {
            return null;
        }
        if (addressType.equalsIgnoreCase("Pharmacy")) {
            return new PharmacyAddress();
        } else if (addressType.equalsIgnoreCase("Customer")) {
            return new CustomerAddress();
        }
        return null;
    }
}
