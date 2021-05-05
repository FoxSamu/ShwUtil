package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code long}.
 */
public interface ShortDoubleRef2LongFn<P3> {
    long invoke(short p1, double p2, P3 p3);
}
