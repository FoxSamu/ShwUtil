package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code char} and returns an object.
 */
public interface DoubleByteChar2RefFn<R> {
    R invoke(double p1, byte p2, char p3);
}
