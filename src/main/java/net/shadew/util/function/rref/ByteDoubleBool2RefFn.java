package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface ByteDoubleBool2RefFn<R> {
    R invoke(byte p1, double p2, boolean p3);
}
