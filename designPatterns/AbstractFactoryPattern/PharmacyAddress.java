package pharmacy.designPatterns.AbstractFactoryPattern;

public class PharmacyAddress implements Address {
    @Override
    public void addAddress() {
        System.out.println("Pharmacy address added.");
    }
}
