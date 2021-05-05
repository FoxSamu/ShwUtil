package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code short} and returns an object.
 */
public interface IntLongShort2RefFn<R> {
    R invoke(int p1, long p2, short p3);
}
