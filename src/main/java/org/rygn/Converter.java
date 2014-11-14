package org.rygn;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
