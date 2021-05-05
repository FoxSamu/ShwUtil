package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code short} and an object and returns a {@code long}.
 */
public interface ShortShortRef2LongFn<P3> {
    long invoke(short p1, short p2, P3 p3);
}
