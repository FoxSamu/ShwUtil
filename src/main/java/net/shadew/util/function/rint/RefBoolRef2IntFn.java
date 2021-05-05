package net.shadew.util.function.rint;

/**
 * A function that takes an object, a {@code boolean} and an object and returns an {@code int}.
 */
public interface RefBoolRef2IntFn<P1, P3> {
    int invoke(P1 p1, boolean p2, P3 p3);
}
