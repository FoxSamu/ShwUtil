package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns an {@code int}.
 */
public interface IntBoolRef2IntFn<P3> {
    int invoke(int p1, boolean p2, P3 p3);
}