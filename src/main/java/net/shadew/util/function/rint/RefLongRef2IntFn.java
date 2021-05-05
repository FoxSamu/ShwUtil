package net.shadew.util.function.rint;

/**
 * A function that takes an object, a {@code long} and an object and returns an {@code int}.
 */
public interface RefLongRef2IntFn<P1, P3> {
    int invoke(P1 p1, Long p2, P3 p3);
}
