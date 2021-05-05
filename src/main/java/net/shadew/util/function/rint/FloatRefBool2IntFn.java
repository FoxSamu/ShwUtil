package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, an object and a {@code boolean} and returns an {@code int}.
 */
public interface FloatRefBool2IntFn<P2> {
    int invoke(float p1, P2 p2, boolean p3);
}
