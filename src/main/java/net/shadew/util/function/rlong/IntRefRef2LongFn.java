package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code long}.
 */
public interface IntRefRef2LongFn<P2, P3> {
    long invoke(int p1, P2 p2, P3 p3);
}
