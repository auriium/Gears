package me.aurium.beetle.gears.config.node;

import java.util.Collection;

public interface Node {

    String getNodeIdentifier();
    Collection<Node> getSubNodes();

}
