package net.shadew.util.function.rint;

/**
 * A function that takes an object, an object and a {@code float} and returns an {@code int}.
 */
public interface RefRefFloat2IntFn<P1, P2> {
    int invoke(P1 p1, P2 p2, float p3);
}
