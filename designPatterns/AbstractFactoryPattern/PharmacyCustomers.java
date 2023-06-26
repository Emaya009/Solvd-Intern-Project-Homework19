package pharmacy.designPatterns.AbstractFactoryPattern;

public class PharmacyCustomers implements Customers {
    @Override
    public void addCustomers() {
        System.out.println("Pharmacy customer added.");
    }

}
