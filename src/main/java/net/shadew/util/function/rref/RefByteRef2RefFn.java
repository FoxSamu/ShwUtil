package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code byte} and an object and returns an object.
 */
public interface RefByteRef2RefFn<P1, P3, R> {
    R invoke(P1 p1, byte p2, P3 p3);
}
