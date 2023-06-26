package pharmacy.solidPrinciples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoctorDetail implements GeneralPhysician,Surgeon {
    Logger logger = LogManager.getLogger(pharmacy.solidPrinciples.DoctorDetail.class);

    @Override
    public void consultation() {
        logger.info("Dr. Leo provides neuro consultation");
    }

    @Override
    public void specialization() {
        logger.info("Dr. Leo is a neuro surgeon");
    }
}
