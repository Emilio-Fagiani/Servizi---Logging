package it.develhope.Servizi.Logging.controller;

import it.develhope.Servizi.Logging.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class BasicController {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    GreetingService greetingService;
    @GetMapping("/")

    public String getMex(){
        String welcome = "Welcome";
        logger.info(welcome);
        return welcome;
    }

    @GetMapping("/exp")
    public void getExp(){
        greetingService.getExp();
    }

    @GetMapping("/error")
    public void getError(){
        Error error = new Error("Error");
        logger.error("This is the logging error", error);
    }


}
