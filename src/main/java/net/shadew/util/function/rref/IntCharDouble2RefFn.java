package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code double} and returns an object.
 */
public interface IntCharDouble2RefFn<R> {
    R invoke(int p1, char p2, double p3);
}