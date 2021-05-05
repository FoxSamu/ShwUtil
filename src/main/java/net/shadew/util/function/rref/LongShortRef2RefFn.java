package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns an object.
 */
public interface LongShortRef2RefFn<P3, R> {
    R invoke(long p1, short p2, P3 p3);
}
