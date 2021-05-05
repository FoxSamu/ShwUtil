package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns an {@code int}.
 */
public interface IntRefDouble2IntFn<P2> {
    int invoke(int p1, P2 p2, double p3);
}
