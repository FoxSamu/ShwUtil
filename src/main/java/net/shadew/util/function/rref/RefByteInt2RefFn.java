package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns an object.
 */
public interface RefByteInt2RefFn<P1, R> {
    R invoke(P1 p1, byte p2, int p3);
}
