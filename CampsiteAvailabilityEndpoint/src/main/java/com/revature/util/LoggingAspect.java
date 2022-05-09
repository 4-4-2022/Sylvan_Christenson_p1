package com.revature.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * This class will serve as our logging aspect. An aspect represents a modularization of a cross-cutting concern.
 * As logging is a concern that spans multiple layers of our application, we want to centralize the place where we
 * write the source code for our logging statements. We will then rely on AOP to inject our advice where we tell it to.
 * Recall that advice is code that will be injected elsewhere.
 * 
 * As Spring will create an instance of this LoggingAspect class, we
 * want it to be a Spring bean.
 */

@Aspect
@Component("loggingAspect")
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("within(com.revature.controllers.*)")
	public void loginWithinControllerPackage() {
	}

	@Before("loginWithinControllerPackage()")
	public void logBefore(JoinPoint jp) {
		logger.info("Controller" + " " + jp.getSignature().getName() + " " + "was called.");
	}

	@After("loginWithinControllerPackage()")
	public void logAfter(JoinPoint jp) {
		logger.info("Logging after: " + jp.getSignature().getName());
	}

	@AfterReturning(value = "loginWithinControllerPackage()", returning = "returnedObject")
	public void logAfterReturning(JoinPoint jp, Object returnedObject) {
		logger.info(jp.getSignature().getName() + " method returned " + returnedObject);
	}

	@AfterThrowing(value = "loginWithinControllerPackage()", throwing = "thrownException")
	public void logAfterThrowing(JoinPoint jp, Exception thrownException) {
		logger.info(jp.getSignature().getName() + " method has thrown a(n) " + thrownException);
	}

	
}
