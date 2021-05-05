package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code long} and returns an object.
 */
public interface DoubleByteLong2RefFn<R> {
    R invoke(double p1, byte p2, long p3);
}
