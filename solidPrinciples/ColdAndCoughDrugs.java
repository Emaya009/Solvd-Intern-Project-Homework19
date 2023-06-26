package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ColdAndCoughDrugs extends ProductStock {
    Logger logger = LogManager.getLogger(ColdAndCoughDrugs.class);

    public ColdAndCoughDrugs() {
    }

    public ColdAndCoughDrugs(int product_id, String product_name, int product_quantity) {
        super(product_id, product_name, product_quantity);
    }
    public void productDetails()
    {
        logger.info("Cold and cough drug details: product id - " + getProduct_id() + " product name- " + getProduct_name() + " product quantity- " + getProduct_quantity());
    }
    public void Dosage()
    {
        logger.info("Infants should take 2.5ml and children above 2 years can take 5ml");
    }
}
