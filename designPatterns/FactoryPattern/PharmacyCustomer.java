package pharmacy.designPatterns.FactoryPattern;

public class PharmacyCustomer implements Customer  {

    @Override
    public void buyMedicine() {
        System.out.println("Pharmacy customer is buying medicine.");
    }
}
