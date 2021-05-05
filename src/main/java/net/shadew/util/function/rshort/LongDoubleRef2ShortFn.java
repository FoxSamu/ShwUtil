package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code short}.
 */
public interface LongDoubleRef2ShortFn<P3> {
    short invoke(long p1, double p2, P3 p3);
}
