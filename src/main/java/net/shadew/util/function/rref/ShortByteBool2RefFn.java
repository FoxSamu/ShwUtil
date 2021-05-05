package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface ShortByteBool2RefFn<R> {
    R invoke(short p1, byte p2, boolean p3);
}
