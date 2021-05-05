package net.shadew.util.function.rref;

/**
 * A function that takes an object and an {@code int} and returns an object.
 */
public interface RefInt2RefFn<P1, R> {
    R invoke(P1 p1, int p2);
}
