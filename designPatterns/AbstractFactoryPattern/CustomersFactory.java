package pharmacy.designPatterns.AbstractFactoryPattern;

public class CustomersFactory extends AbstractFactory {
    @Override
    public Customers getCustomer(String customerType) {
        if (customerType == null) {
            return null;
        }
        if (customerType.equalsIgnoreCase("Pharmacy Customer")) {
            return new PharmacyCustomers();
        }
        return null;
    }

    @Override
    public Address getAddress(String addressType) {
        return null;
    }


}
