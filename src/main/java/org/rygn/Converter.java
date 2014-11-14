package org.rygn;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
