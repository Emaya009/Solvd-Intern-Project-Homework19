package pharmacy.designPatterns.AbstractFactoryPattern;

public abstract class AbstractFactory {
    public abstract Customers getCustomer(String customerType);
    public abstract Address getAddress(String addressType);
}
