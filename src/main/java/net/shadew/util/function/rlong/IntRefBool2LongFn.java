package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and a {@code boolean} and returns a {@code long}.
 */
public interface IntRefBool2LongFn<P2> {
    long invoke(int p1, P2 p2, boolean p3);
}
