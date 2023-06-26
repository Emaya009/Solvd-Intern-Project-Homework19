package pharmacy.designPatterns.FactoryPattern;

public class HospitalCustomer implements Customer {
    @Override
    public void buyMedicine() {
        System.out.println("Hospital customer is buying medicine.");
    }
}
