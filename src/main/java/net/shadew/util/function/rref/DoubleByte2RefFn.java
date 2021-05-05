package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code byte} and returns an object.
 */
public interface DoubleByte2RefFn<R> {
    R invoke(double p1, byte p2);
}