package me.aurium.beetle.gears.config.annotate;

import me.aurium.beetle.gears.config.ConfParser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation marking that config will be handled here
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigParser {

    Class<ConfParser> parser();

}
