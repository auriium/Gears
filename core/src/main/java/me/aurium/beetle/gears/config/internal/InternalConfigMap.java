package me.aurium.beetle.gears.config.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public class InternalConfigMap implements InvocationHandler {

    private final Map<String,Object> map;

    public InternalConfigMap(Map<String, Object> map){
        this.map = map;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return map.get(method.getName());
    }
}
