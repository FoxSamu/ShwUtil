package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and a {@code double} and returns a {@code long}.
 */
public interface BoolRefDouble2LongFn<P2> {
    long invoke(boolean p1, P2 p2, double p3);
}
