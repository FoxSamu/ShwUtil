package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns a {@code long}.
 */
public interface FloatRefShort2LongFn<P2> {
    long invoke(Float p1, P2 p2, Short p3);
}
