package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code long}.
 */
public interface BoolLongRef2LongFn<P3> {
    long invoke(boolean p1, long p2, P3 p3);
}
