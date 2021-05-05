package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code double} and returns an object.
 */
public interface IntByteDouble2RefFn<R> {
    R invoke(int p1, byte p2, double p3);
}
