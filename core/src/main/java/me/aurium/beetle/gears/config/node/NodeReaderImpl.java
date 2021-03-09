package me.aurium.beetle.gears.config.node;

import java.io.File;

public class NodeReaderImpl implements NodeReader{

    private final File file;

    public NodeReaderImpl(File file) {
        this.file = file;
    }

    @Override
    public Node getBaseNode() {
        return null;
    }

    @Override
    public Node getNodeAtPosition(String nodeKey) {
        return null;
    }
}
