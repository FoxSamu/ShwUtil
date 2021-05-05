package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code long}.
 */
public interface RefBool2LongFn<P1> {
    long invoke(P1 p1, boolean p2);
}
