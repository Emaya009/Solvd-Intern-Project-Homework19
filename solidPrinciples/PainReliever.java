package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PainReliever extends ProductStock {
    Logger logger = LogManager.getLogger(PainReliever.class);
    public PainReliever() {
    }
    public PainReliever(int product_id, String product_name, int product_quantity) {
        super(product_id, product_name, product_quantity);
    }
    public void productDetails()
    {
        logger.info("Pain Reliever details: product id - " + getProduct_id() + " product name- " + getProduct_name() + " product quantity- " + getProduct_quantity());
    }
    public void sideEffects()
    {
        logger.info("Pain reliever causes Drowsiness, dizziness, and mental fog");
    }
}
