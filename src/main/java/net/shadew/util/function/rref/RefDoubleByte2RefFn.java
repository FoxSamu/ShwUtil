package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code double} and a {@code byte} and returns an object.
 */
public interface RefDoubleByte2RefFn<P1, R> {
    R invoke(P1 p1, double p2, byte p3);
}
