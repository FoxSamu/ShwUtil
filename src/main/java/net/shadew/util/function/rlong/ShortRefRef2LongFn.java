package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an object and an object and returns a {@code long}.
 */
public interface ShortRefRef2LongFn<P2, P3> {
    long invoke(short p1, P2 p2, P3 p3);
}
