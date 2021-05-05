package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and a {@code long} and returns a {@code long}.
 */
public interface RefBoolLong2LongFn<P1> {
    long invoke(P1 p1, boolean p2, long p3);
}
