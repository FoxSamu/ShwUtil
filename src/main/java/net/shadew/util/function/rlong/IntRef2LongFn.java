package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int} and an object and returns a {@code long}.
 */
public interface IntRef2LongFn<P2> {
    long invoke(int p1, P2 p2);
}
