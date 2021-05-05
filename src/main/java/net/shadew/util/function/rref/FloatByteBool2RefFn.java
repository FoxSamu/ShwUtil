package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface FloatByteBool2RefFn<R> {
    R invoke(float p1, byte p2, boolean p3);
}
