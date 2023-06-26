package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Single Responsibility Principle
public class CustomerPurchaseDetail {
    Logger logger = LogManager.getLogger(CustomerPurchaseDetail.class);

    private int order_id;
    private int customer_id;
    private int med_id;
    private int payment_mode;
    private double amount_paid;
    private double discount;
    private String status;
    private String comment;
    private String invoiceno;

    public CustomerPurchaseDetail() {
    }

    public CustomerPurchaseDetail(int order_id, int customer_id, int med_id, int payment_mode, double amount_paid, double discount, String status, String comment, String invoiceno) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.med_id = med_id;
        this.payment_mode = payment_mode;
        this.amount_paid = amount_paid;
        this.discount = discount;
        this.status = status;
        this.comment = comment;
        this.invoiceno = invoiceno;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public int getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(int payment_mode) {
        this.payment_mode = payment_mode;
    }

    public double getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(double amount_paid) {
        this.amount_paid = amount_paid;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    @Override
    public String toString() {
        return "CustomerPurchaseDetail{" +
                "order_id=" + order_id +
                ", customer_id=" + customer_id +
                ", med_id=" + med_id +
                ", payment_mode=" + payment_mode +
                ", amount_paid=" + amount_paid +
                ", discount=" + discount +
                ", status='" + status + '\'' +
                ", comment=" + comment +
                ", invoiceno='" + invoiceno + '\'' +
                '}';
    }

    public void customerPurchaseDetail()
    {
        logger.info("Customer order details: Order id: "+getOrder_id() +" customer id: " +getCustomer_id() +" Med id: " +getMed_id() +" amount paid: " +getAmount_paid());
    }
}
