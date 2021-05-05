package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface ByteFloatBool2RefFn<R> {
    R invoke(byte p1, float p2, boolean p3);
}
