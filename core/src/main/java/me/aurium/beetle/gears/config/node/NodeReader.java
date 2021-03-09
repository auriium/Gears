package me.aurium.beetle.gears.config.node;

public interface NodeReader {

    Node getBaseNode();
    Node getNodeAtPosition(String nodeKey);

}
