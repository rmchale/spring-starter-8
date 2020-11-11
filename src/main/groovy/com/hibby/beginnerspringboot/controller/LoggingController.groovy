package com.hibby.beginnerspringboot.controller

import com.hibby.beginnerspringboot.bean.ClassInjection
import com.hibby.beginnerspringboot.bean.MyBean
import groovy.util.logging.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.util.logging.Logger

@RestController
@Slf4j
class LoggingController {

    @Autowired ClassInjection injected;
    @Autowired MyBean myBean

    @RequestMapping("/")
    public String index() {
        log.info("my code {} {}", injected.run(), myBean.run())
        return "Howdy! Check out the Logs to see the output...";
    }
}
