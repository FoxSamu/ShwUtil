package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code byte} and returns an object.
 */
public interface DoubleIntByte2RefFn<R> {
    R invoke(double p1, int p2, byte p3);
}
