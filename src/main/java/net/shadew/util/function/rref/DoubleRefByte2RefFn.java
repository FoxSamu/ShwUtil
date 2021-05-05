package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns an object.
 */
public interface DoubleRefByte2RefFn<P2, R> {
    R invoke(double p1, P2 p2, byte p3);
}
