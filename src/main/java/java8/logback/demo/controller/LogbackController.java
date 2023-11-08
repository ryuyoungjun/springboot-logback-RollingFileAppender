package java8.logback.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogbackController {

    private static Logger logger = LoggerFactory.getLogger(LogbackController.class);

    @GetMapping("/logback")
    public String logbackTestPage() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "logbackTestPage";
    }
}
