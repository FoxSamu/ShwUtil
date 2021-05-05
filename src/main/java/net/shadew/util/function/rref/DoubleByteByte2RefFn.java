package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface DoubleByteByte2RefFn<R> {
    R invoke(double p1, byte p2, byte p3);
}
