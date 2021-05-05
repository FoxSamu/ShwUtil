package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface ByteShortBool2RefFn<R> {
    R invoke(byte p1, short p2, boolean p3);
}
