package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and an {@code int} and returns an object.
 */
public interface DoubleByteInt2RefFn<R> {
    R invoke(double p1, byte p2, int p3);
}
