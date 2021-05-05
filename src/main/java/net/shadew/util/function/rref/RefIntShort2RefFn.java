package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and a {@code short} and returns an object.
 */
public interface RefIntShort2RefFn<P1, R> {
    R invoke(P1 p1, int p2, short p3);
}
