package me.aurium.beetle.gears.snakeyaml;

import me.aurium.beetle.gears.config.node.Node;
import me.aurium.beetle.gears.config.node.NodeReader;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.Reader;
import java.util.Map;

public class SnakeYamlNodeReader implements NodeReader {

    private final Yaml yaml;

    public SnakeYamlNodeReader(Yaml yaml, Reader reader) {
        this.yaml = yaml;
        Map map = yaml.load("scremaing");
        File file;
    }

    @Override
    public Node getBaseNode() {
        return null;
    }

    @Override
    public Node getNodeAtPosition(String nodeKey) {
        return yaml.;
    }
}
