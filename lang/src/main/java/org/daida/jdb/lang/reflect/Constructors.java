package org.daida.jdb.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Constructors {
    public static <T> T newInstace(Class<T> clazz, Object ... initargs) throws ReflectException {
        var parameterTypes = Arrays.stream(initargs).map(Object::getClass).toArray(Class<?>[]::new);
        var constructor = Constructors.getConstructor(clazz, parameterTypes);
        try {
            return constructor.newInstance(initargs);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public static <T> Constructor<T> getConstructor(Class<T> clazz, Class<?>... parameterTypes) throws ReflectException {
        try {
            var constructor = clazz.getDeclaredConstructor(parameterTypes);
            constructor.setAccessible(true);
            return constructor;
        } catch (NoSuchMethodException e) {
            throw new ReflectException(e);
        }
    }
}
