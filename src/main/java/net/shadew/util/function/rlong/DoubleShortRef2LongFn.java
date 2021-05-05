package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns a {@code long}.
 */
public interface DoubleShortRef2LongFn<P3> {
    long invoke(double p1, short p2, P3 p3);
}
