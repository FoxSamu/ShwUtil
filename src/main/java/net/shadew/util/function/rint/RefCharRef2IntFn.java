package net.shadew.util.function.rint;

/**
 * A function that takes an object, a {@code char} and an object and returns an {@code int}.
 */
public interface RefCharRef2IntFn<P1, P3> {
    int invoke(P1 p1, char p2, P3 p3);
}
