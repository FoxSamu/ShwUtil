package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and an object and returns an object.
 */
public interface ByteDoubleRef2RefFn<P3, R> {
    R invoke(byte p1, double p2, P3 p3);
}
