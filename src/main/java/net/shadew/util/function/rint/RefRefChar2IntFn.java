package net.shadew.util.function.rint;

/**
 * A function that takes an object, an object and a {@code char} and returns an {@code int}.
 */
public interface RefRefChar2IntFn<P1, P2> {
    int invoke(P1 p1, P2 p2, char p3);
}
