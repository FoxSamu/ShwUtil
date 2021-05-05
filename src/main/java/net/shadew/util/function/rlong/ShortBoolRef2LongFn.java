package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface ShortBoolRef2LongFn<P3> {
    long invoke(short p1, boolean p2, P3 p3);
}
