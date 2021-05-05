package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns an {@code int}.
 */
public interface IntLongRef2IntFn<P3> {
    int invoke(int p1, long p2, P3 p3);
}
