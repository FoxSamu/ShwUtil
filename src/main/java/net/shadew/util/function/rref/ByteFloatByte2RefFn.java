package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code byte} and returns an object.
 */
public interface ByteFloatByte2RefFn<R> {
    R invoke(byte p1, float p2, byte p3);
}
