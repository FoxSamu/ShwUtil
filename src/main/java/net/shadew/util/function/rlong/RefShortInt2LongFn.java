package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code short} and an {@code int} and returns a {@code long}.
 */
public interface RefShortInt2LongFn<P1> {
    long invoke(P1 p1, short p2, int p3);
}
