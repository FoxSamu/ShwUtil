package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an object and a {@code float} and returns an {@code int}.
 */
public interface LongRefFloat2IntFn<P2> {
    int invoke(long p1, P2 p2, float p3);
}
