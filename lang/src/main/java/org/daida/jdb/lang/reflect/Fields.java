package org.daida.jdb.lang.reflect;

import java.lang.reflect.Field;

public class Fields {
    public static Object getFieldValue(Object obj, String name) throws ReflectException {
        var field = Fields.getField(obj.getClass(), name);
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }
    public static void setFieldValue(Object obj, String name, Object value) throws ReflectException {
        var field = Fields.getField(obj.getClass(), name);
        try {
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public static Object getStaticFieldValue(Class<?> clazz, String name) throws ReflectException {
        var field = Fields.getField(clazz, name);
        try {
            return field.get(clazz);
        } catch (IllegalAccessException e) {
            throw new ReflectException(e);
        }
    }

    public static void setStaticFieldValue(Class<?> clazz, String name, Object value) throws ReflectException {
        var field = Fields.getField(clazz, name);
        try {
            field.set(clazz, value);
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
