package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns an {@code int}.
 */
public interface IntFloatRef2IntFn<P3> {
    int invoke(int p1, float p2, P3 p3);
}
