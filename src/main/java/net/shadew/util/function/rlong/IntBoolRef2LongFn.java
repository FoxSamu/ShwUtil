package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface IntBoolRef2LongFn<P3> {
    long invoke(int p1, boolean p2, P3 p3);
}
