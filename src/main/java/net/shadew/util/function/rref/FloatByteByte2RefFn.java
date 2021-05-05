package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface FloatByteByte2RefFn<R> {
    R invoke(float p1, byte p2, byte p3);
}
