package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and a {@code short} and returns a {@code long}.
 */
public interface IntRefShort2LongFn<P2> {
    long invoke(int p1, P2 p2, short p3);
}
