package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Interface Segregation Principle
public class CustomerType implements HospitalCustomer {
    Logger logger = LogManager.getLogger(pharmacy.solidPrinciples.CustomerType.class);
    public void customerType()
    {
        logger.info("This customer is a Hospital Customer");
    }
}
