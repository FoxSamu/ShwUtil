package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code byte} and a {@code short} and returns an object.
 */
public interface RefByteShort2RefFn<P1, R> {
    R invoke(P1 p1, byte p2, short p3);
}
