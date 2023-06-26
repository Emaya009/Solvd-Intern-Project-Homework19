package pharmacy.designPatterns.AbstractFactoryPattern;

public class CustomerAddress implements Address {
    @Override
    public void addAddress() {
        System.out.println("Customer address added.");
    }
}
