package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and an {@code int} and returns a {@code long}.
 */
public interface RefBoolInt2LongFn<P1> {
    long invoke(P1 p1, boolean p2, int p3);
}
