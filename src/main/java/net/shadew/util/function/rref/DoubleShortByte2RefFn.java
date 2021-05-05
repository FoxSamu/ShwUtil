package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code byte} and returns an object.
 */
public interface DoubleShortByte2RefFn<R> {
    R invoke(double p1, short p2, byte p3);
}
