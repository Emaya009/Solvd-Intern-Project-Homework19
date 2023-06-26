package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Open Closed Principle
public abstract class ProductStock {
    Logger logger = LogManager.getLogger(ProductStock.class);
    private int product_id;
    private String product_name;
    private int product_quantity;

    public ProductStock() {
    }

    public ProductStock(int product_id, String product_name, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_quantity = product_quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }
    public abstract void productDetails();

}
