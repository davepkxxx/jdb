package org.daida.jdb.lang.reflect;

import java.lang.reflect.Field;

public class Fields {
    public static Object getFieldValue(Object obj, String name) throws ReflectException {
        var field = Fields.getField(obj.getClass(), name);;
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public static Object getFieldValue(Class<?> clazz, String name) throws ReflectException {
        var field = Fields.getField(clazz, name);;
        try {
            return field.get(clazz);
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public static Field getField(Class<?> clazz, String name) throws ReflectException {
        try {
            var field = clazz.getDeclaredField(name);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new ReflectException(e);
        }
    }
}
