package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and a {@code short} and returns a {@code long}.
 */
public interface RefLongShort2LongFn<P1> {
    long invoke(P1 p1, long p2, short p3);
}
