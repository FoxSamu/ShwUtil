package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code double} and returns an object.
 */
public interface ByteIntDouble2RefFn<R> {
    R invoke(byte p1, int p2, double p3);
}
