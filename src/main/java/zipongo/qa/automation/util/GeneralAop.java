package zipongo.qa.automation.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by halley.short.
 * Used by Spring AOP for logging and exception handling
 */
public class GeneralAop {
    private static final Logger log = (Logger) LoggerFactory.getLogger(GeneralAop.class);


    public Object aroundActions(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result;
        try {
            log.info("AOP: " + joinPoint.getTarget().getClass() + "." +
                    joinPoint.getSignature().getName());
            result = joinPoint.proceed();

        } catch (Exception e) {
            log.error(e.getMessage());
            throw (e);
        }
        return result;
    }
}
