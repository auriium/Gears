package me.aurium.beetle.gears.config;

import me.aurium.beetle.gears.config.node.Node;

/**
 * Thing that parses...
 */
public interface ConfParser<T> {

    T parse(Node node);

}
