package net.shadew.util.function.rint;

/**
 * A function that takes an object, an {@code int} and an object and returns an {@code int}.
 */
public interface RefIntRef2IntFn<P1, P3> {
    int invoke(P1 p1, int p2, P3 p3);
}
