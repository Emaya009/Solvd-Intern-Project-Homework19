package pharmacy.designPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.designPatterns.AbstractFactoryPattern.AbstractFactory;
import pharmacy.designPatterns.AbstractFactoryPattern.Address;
import pharmacy.designPatterns.AbstractFactoryPattern.Customers;
import pharmacy.designPatterns.AbstractFactoryPattern.FactoryProducer;
import pharmacy.designPatterns.BuilderPattern.Doctor;
import pharmacy.designPatterns.FactoryPattern.Customer;
import pharmacy.designPatterns.FactoryPattern.CustomerFactory;
import pharmacy.designPatterns.ListenerPattern.Prescription_item;
import pharmacy.designPatterns.ListenerPattern.Prescription_itemsListener;
import pharmacy.solidPrinciples.*;

public class Main {

    public static void main (String[] args) {

        Logger logger = LogManager.getLogger(pharmacy.designPatterns.Main.class);

        //Factory Pattern instance
        Customer pharmacyCustomer = CustomerFactory.getCustomer("Pharmacy");
        pharmacyCustomer.buyMedicine();

        //Abstract Factory Pattern instance
        AbstractFactory pharmacyFactory = FactoryProducer.getFactory("Pharmacy");
        Customers pharmacyCustomer1 = pharmacyFactory.getCustomer("Pharmacy Customer");
        if (pharmacyCustomer1 != null) {
            pharmacyCustomer1.addCustomers();
        }
        Address pharmacyAddress=pharmacyFactory.getAddress("Customer");
        pharmacyAddress.addAddress();

        //Builder Pattern instance
        Doctor doctor = new Doctor.DoctorBuilder()
                .setName("Dr. John Doe")
                .setSpecialization("Cardiology")
                .setPhone("123-456-7890")
                .build();
        logger.info("Doctor details: " +doctor);

        //Listener Pattern instance
        Prescription_item prescriptionItem = new Prescription_item();
        Prescription_itemsListener listener = new Prescription_itemsListener() {
            @Override
            public void onPrescriptionItemsUpdated(Prescription_item prescriptionItem) {
                logger.info("Prescription items updated!");
            }

                   };
        prescriptionItem.addListener(listener);
        prescriptionItem.updatePrescriptionItems();

        //Single Responsibility Principle
        CustomerAddressDetail customerAddressDetail = new CustomerAddressDetail(123,"312 May coxlane","Chesapeake","Virginia","United States");
        customerAddressDetail.printAddressDetails();
        CustomerPurchaseDetail customerPurchaseDetail=new CustomerPurchaseDetail(13,231,6732,222,23.5,0.5,"PAID","Discount applicable","326737232");
        customerPurchaseDetail.customerPurchaseDetail();

        //Open Closed principle
        PainReliever painReliever=new PainReliever(32,"Advil",50);
        painReliever.productDetails();

        //Liskov Substitution Principle
        painReliever.sideEffects();
        ColdAndCoughDrugs coldAndCoughDrugs=new ColdAndCoughDrugs(244,"Benadryl",10);
        coldAndCoughDrugs.productDetails();
        //Liskov Substitution Principle
        coldAndCoughDrugs.Dosage();

        //Interface Segregation Principle
        CustomerType customerType=new CustomerType();
        customerType.customerType();

        //Dependency Inversion Principle
        DoctorDetail doctorDetail=new DoctorDetail();
        doctorDetail.consultation();
        doctorDetail.specialization();
    }
}
