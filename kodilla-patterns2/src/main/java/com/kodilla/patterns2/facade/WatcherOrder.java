package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.API.OrderDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrder {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.API.OrderFacade.processingOrder(..))" +
            "&& target(object) && args (order, userId) ")
    public void logEvent(Object object, OrderDto order, Long userId) {
        LOGGER.info(" Class: " + object.getClass().getName() + " UserId: " + userId);
    }

    @Around("execution(* com.kodilla.patterns2.facade.API.OrderFacade.processingOrder(..))")
    public Object measureTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch (Throwable ex) {
            LOGGER.error(ex.getMessage());
            throw ex;
        }
        return result;
    }

    @AfterThrowing(
            pointcut = "execution(* com.kodilla.patterns2.facade.API.OrderFacade.processingOrder(..))",
            throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {

        LOGGER.info("logAfterThrowing() is running!");
        LOGGER.info("Method : " + joinPoint.getSignature().getName());
        LOGGER.error("Exception : " + ex);
    }
}