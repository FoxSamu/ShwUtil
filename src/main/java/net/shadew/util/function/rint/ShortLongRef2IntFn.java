package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns an {@code int}.
 */
public interface ShortLongRef2IntFn<P3> {
    int invoke(short p1, long p2, P3 p3);
}
