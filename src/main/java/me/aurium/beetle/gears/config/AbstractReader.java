package me.aurium.beetle.gears.config;

import me.aurium.beetle.gears.config.annotate.ConfigKey;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AbstractReader implements Reader{

    private Interacter interacter;

    public AbstractReader(Interacter interacter) {
        this.interacter = interacter;
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


        }
    }

    @Override
    public InternalConfigMap writeAndRead(File file, Class<MutableConf> confClass) {
        return null;
    }

}
