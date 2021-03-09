package me.aurium.beetle.gears.config.nodeparser;

import me.aurium.beetle.gears.config.node.SingleValueNode;

public interface SingleValueNodeParser<T> {

    T parse(SingleValueNode node);

}
