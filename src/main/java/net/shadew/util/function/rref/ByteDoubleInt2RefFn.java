package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and an {@code int} and returns an object.
 */
public interface ByteDoubleInt2RefFn<R> {
    R invoke(byte p1, double p2, int p3);
}
