package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code byte} and returns an object.
 */
public interface DoubleLongByte2RefFn<R> {
    R invoke(double p1, long p2, byte p3);
}
