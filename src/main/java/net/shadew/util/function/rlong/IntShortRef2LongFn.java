package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code long}.
 */
public interface IntShortRef2LongFn<P3> {
    long invoke(int p1, short p2, P3 p3);
}
