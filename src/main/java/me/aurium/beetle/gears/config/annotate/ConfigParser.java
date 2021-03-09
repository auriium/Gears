package me.aurium.beetle.gears.config.annotate;

import me.aurium.beetle.gears.config.Parser;
import me.aurium.beetle.gears.config.Reader;

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

    /**
     * Parser.
     * @return a parser class
     */
    Class<Parser> parser();

}
