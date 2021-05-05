package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code float} and returns an object.
 */
public interface IntByteFloat2RefFn<R> {
    R invoke(int p1, byte p2, float p3);
}
