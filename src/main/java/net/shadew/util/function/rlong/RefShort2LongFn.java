package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code short} and returns a {@code long}.
 */
public interface RefShort2LongFn<P1> {
    long invoke(P1 p1, short p2);
}
