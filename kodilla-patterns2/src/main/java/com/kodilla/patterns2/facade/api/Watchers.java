package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watchers {

    private static final Logger LOGGER = LoggerFactory.getLogger(Watchers.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void startProcess() {
        LOGGER.info("Start process");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void endProcess() {
        LOGGER.info("Process was successful");
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void errorProcess() {
        LOGGER.info("Error process!");
    }
}
