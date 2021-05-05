package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code double} and returns an object.
 */
public interface DoubleByteDouble2RefFn<R> {
    R invoke(double p1, byte p2, double p3);
}
