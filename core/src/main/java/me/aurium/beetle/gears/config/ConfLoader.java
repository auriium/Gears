package me.aurium.beetle.gears.config;

import me.aurium.beetle.gears.config.internal.InternalConfigMap;
import me.aurium.beetle.gears.config.internal.MutableConf;

import java.io.File;

public interface ConfLoader {

    InternalConfigMap read(File file, Class<MutableConf> confClass);
    void write(File file, Class<MutableConf> confClass);

    InternalConfigMap writeAndRead(File file, Class<MutableConf> confClass);

}
