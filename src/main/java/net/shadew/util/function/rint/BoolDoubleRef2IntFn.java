package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns an {@code int}.
 */
public interface BoolDoubleRef2IntFn<P3> {
    int invoke(boolean p1, double p2, P3 p3);
}
