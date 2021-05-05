package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface LongByteBool2RefFn<R> {
    R invoke(long p1, byte p2, boolean p3);
}
