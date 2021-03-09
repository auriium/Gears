package me.aurium.beetle.gears.config;

import me.aurium.beetle.gears.config.annotate.ConfigKey;
import me.aurium.beetle.gears.config.internal.InternalConfigMap;
import me.aurium.beetle.gears.config.internal.MutableConf;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AbstractConfLoader implements ConfLoader {

    private ConfReader confReader;

    public AbstractConfLoader(ConfReader confReader) {
        this.confReader = confReader;
    }

    @Override
    public InternalConfigMap read(File file, Class<MutableConf> confClass) {
        Map<String,Object> returnable = new HashMap<>();




        return new InternalConfigMap(returnable);
    }

    @Override
    public void write(File file, Class<MutableConf> confClass) {
        for (Method method : confClass.getMethods()) {
            String key = method.getName();

            if (method.isAnnotationPresent(ConfigKey.class)) {
                key = method.getAnnotation(ConfigKey.class).identifier();
            }

            confReader.


        }
    }

    @Override
    public InternalConfigMap writeAndRead(File file, Class<MutableConf> confClass) {
        return null;
    }

}
