package net.shadew.util.function.rint;

/**
 * A function that takes an object and an object and returns an {@code int}.
 */
public interface RefRef2IntFn<P1, P2> {
    int invoke(P1 p1, P2 p2);
}
