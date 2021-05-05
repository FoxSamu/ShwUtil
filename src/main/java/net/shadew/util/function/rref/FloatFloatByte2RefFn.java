package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and a {@code byte} and returns an object.
 */
public interface FloatFloatByte2RefFn<R> {
    R invoke(float p1, float p2, byte p3);
}
