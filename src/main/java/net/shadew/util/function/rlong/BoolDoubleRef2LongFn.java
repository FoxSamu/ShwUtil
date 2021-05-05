package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns a {@code long}.
 */
public interface BoolDoubleRef2LongFn<P3> {
    long invoke(boolean p1, double p2, P3 p3);
}
