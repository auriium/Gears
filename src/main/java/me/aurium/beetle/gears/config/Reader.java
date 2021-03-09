package me.aurium.beetle.gears.config;

import java.io.File;

public interface Reader {

    InternalConfigMap read(File file, Class<MutableConf> confClass);
    void write(File file, Class<MutableConf> confClass);

    InternalConfigMap writeAndRead(File file, Class<MutableConf> confClass);

}
