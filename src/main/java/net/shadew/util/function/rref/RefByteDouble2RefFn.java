package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code byte} and a {@code double} and returns an object.
 */
public interface RefByteDouble2RefFn<P1, R> {
    R invoke(P1 p1, byte p2, double p3);
}
