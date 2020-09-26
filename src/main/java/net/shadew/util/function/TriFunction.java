/*
 * Copyright (c) 2020 Shadew
 * Licensed under the Apache 2.0 License
 */

package net.shadew.util.function;

import java.util.function.Function;

import net.shadew.util.contract.Validate;

/**
 * Represents a function that accepts one argument and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object, Object, Object)}.
 *
 * @param <T> the first type of the input to the function
 * @param <U> the second type of the input to the function
 * @param <V> the thrid type of the input to the function
 * @param <R> the type of the result of the function
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t The first function argument
     * @param u The second function argument
     * @param v The third function argument
     * @return The function result
     */
    R apply(T t, U u, V v);

    /**
     * Returns a composed function that first applies this function to its input, and then applies the {@code after}
     * function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the
     * composed function.
     *
     * @param <S>   The type of output of the {@code after} function, and of the composed function
     * @param after The function to apply after this function is applied
     * @return A composed function that first applies this function and then applies the {@code after} function
     *
     * @throws NullPointerException If after is null
     */
    default <S> TriFunction<T, U, V, S> andThen(Function<? super R, ? extends S> after) {
        Validate.notNull(after, "after");
        return (t, u, v) -> after.apply(apply(t, u, v));
    }
}
