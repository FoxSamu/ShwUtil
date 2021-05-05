package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code long}.
 */
public interface BoolRefBool2LongFn<P2> {
    long invoke(boolean p1, P2 p2, boolean p3);
}
