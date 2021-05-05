package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code long}.
 */
public interface BoolRef2LongFn<P2> {
    long invoke(boolean p1, P2 p2);
}
