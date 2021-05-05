package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code float} and returns an object.
 */
public interface FloatByteFloat2RefFn<R> {
    R invoke(float p1, byte p2, float p3);
}
