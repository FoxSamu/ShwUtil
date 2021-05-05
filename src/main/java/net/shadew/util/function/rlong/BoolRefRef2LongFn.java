package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and an object and returns a {@code long}.
 */
public interface BoolRefRef2LongFn<P2, P3> {
    long invoke(boolean p1, P2 p2, P3 p3);
}
