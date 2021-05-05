package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code byte} and returns an object.
 */
public interface FloatIntByte2RefFn<R> {
    R invoke(float p1, int p2, byte p3);
}
