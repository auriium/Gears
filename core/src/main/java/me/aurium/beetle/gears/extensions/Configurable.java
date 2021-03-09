package me.aurium.beetle.gears.extensions;

import me.aurium.beetle.gears.config.ConfParser;

public interface Configurable {

    ConfParser<?> getRelativeParser();

}
