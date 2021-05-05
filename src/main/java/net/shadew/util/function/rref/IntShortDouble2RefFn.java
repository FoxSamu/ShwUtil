package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code double} and returns an object.
 */
public interface IntShortDouble2RefFn<R> {
    R invoke(int p1, short p2, double p3);
}
