package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code short} and returns an object.
 */
public interface DoubleByteShort2RefFn<R> {
    R invoke(double p1, byte p2, short p3);
}
