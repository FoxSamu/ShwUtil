package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code short} and returns an object.
 */
public interface IntShortShort2RefFn<R> {
    R invoke(int p1, short p2, short p3);
}
