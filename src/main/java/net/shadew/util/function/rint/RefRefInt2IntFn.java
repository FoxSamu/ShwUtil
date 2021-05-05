package net.shadew.util.function.rint;

/**
 * A function that takes an object, an object and an {@code int} and returns an {@code int}.
 */
public interface RefRefInt2IntFn<P1, P2> {
    int invoke(P1 p1, P2 p2, int p3);
}
