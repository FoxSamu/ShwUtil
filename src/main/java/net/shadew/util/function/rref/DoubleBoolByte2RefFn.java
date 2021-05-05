package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface DoubleBoolByte2RefFn<R> {
    R invoke(double p1, boolean p2, byte p3);
}
