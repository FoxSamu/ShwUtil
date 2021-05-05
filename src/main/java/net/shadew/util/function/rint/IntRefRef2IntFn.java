package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, an object and an object and returns an {@code int}.
 */
public interface IntRefRef2IntFn<P2, P3> {
    int invoke(int p1, P2 p2, P3 p3);
}
