package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns an {@code int}.
 */
public interface IntDoubleRef2IntFn<P3> {
    int invoke(int p1, double p2, P3 p3);
}
