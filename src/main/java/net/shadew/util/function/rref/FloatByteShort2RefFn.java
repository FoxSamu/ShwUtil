package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code short} and returns an object.
 */
public interface FloatByteShort2RefFn<R> {
    R invoke(float p1, byte p2, short p3);
}
