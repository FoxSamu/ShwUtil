package net.shadew.util.function.rref;

/**
 * A function that takes an object, an object and an {@code int} and returns an object.
 */
public interface RefRefInt2RefFn<P1, P2, R> {
    R invoke(P1 p1, P2 p2, int p3);
}
