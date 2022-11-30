package it.develhope.Servizi.Logging.service;

import it.develhope.Servizi.Logging.controller.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Value("${n1}")
    int n1;
    @Value("${n2}")
    int n2;

    public int getExp() {
        try {
            logger.info("Starting greeting : " + (int) Math.pow(n1, n2));
            return (int) Math.pow(n1, n2);
        } finally {
            logger.info("Finished greeting");
        }
    }

}
