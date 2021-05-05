package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns an {@code int}.
 */
public interface LongShortRef2IntFn<P3> {
    int invoke(long p1, short p2, P3 p3);
}
