package pharmacy.designPatterns.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getCustomer(String choice) {
        if (choice.equalsIgnoreCase("Pharmacy Customer")) {
            return new CustomersFactory();
        }
        return null;
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Pharmacy")) {
            return new PharmacyFactory();
        }
        return null;
    }
}
