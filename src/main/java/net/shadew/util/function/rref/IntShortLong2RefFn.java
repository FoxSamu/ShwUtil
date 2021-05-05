package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code long} and returns an object.
 */
public interface IntShortLong2RefFn<R> {
    R invoke(Int p1, Short p2, Long p3);
}
