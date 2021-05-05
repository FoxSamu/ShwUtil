package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface ByteLongBool2RefFn<R> {
    R invoke(byte p1, long p2, boolean p3);
}
