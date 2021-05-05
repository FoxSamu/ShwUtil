package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code byte} and returns an object.
 */
public interface DoubleDoubleByte2RefFn<R> {
    R invoke(double p1, double p2, byte p3);
}
