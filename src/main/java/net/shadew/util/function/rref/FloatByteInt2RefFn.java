package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and an {@code int} and returns an object.
 */
public interface FloatByteInt2RefFn<R> {
    R invoke(float p1, byte p2, int p3);
}
