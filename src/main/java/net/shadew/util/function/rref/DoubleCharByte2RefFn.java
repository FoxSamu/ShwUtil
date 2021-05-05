package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code byte} and returns an object.
 */
public interface DoubleCharByte2RefFn<R> {
    R invoke(double p1, char p2, byte p3);
}
