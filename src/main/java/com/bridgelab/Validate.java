package com.bridgelab;
@FunctionalInterface
public interface Validate<E> {
    E isValid(E value);
}
