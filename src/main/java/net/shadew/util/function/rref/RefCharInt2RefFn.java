package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns an object.
 */
public interface RefCharInt2RefFn<P1, R> {
    R invoke(P1 p1, char p2, int p3);
}
