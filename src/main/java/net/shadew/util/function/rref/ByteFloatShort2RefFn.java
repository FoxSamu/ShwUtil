package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code short} and returns an object.
 */
public interface ByteFloatShort2RefFn<R> {
    R invoke(byte p1, float p2, short p3);
}
