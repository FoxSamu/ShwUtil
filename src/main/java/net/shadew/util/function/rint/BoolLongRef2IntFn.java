package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns an {@code int}.
 */
public interface BoolLongRef2IntFn<P3> {
    int invoke(boolean p1, long p2, P3 p3);
}
