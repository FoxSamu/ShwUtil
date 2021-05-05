package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns a {@code long}.
 */
public interface BoolRefFloat2LongFn<P2> {
    long invoke(boolean p1, P2 p2, float p3);
}
