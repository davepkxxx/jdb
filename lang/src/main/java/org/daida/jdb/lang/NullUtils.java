package org.daida.jdb.lang;

import java.util.function.Function;

public class NullUtils {
    public static <T, R> R optionalChaining(T obj, Function<T, R> mapper) {
        return NullUtils.optionalChainingOr(obj, mapper, null);
    }

    public static <T, R, D extends R> R optionalChainingOr(T obj, Function<T, R> mapper, D defaultValue) {
        return obj == null ? defaultValue : mapper.apply(obj);
    }
}
