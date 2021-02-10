package io.mosip.print.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation indicating for Pre authentication of content notified by hub and
 * verifying intent after subscribe and unsubscribe operation.
 * 
 * @author Urvil Joshi
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PreAuthenticateContentAndVerifyIntent {

	String secret();

	String topic();

	String callback();
}
