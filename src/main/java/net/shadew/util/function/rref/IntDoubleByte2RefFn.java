package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code byte} and returns an object.
 */
public interface IntDoubleByte2RefFn<R> {
    R invoke(int p1, double p2, byte p3);
}
