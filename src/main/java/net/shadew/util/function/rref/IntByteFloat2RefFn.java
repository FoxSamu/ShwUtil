package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code float} and returns an object.
 */
public interface IntByteFloat2RefFn<R> {
    R invoke(Int p1, Byte p2, Float p3);
}
