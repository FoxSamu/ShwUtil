package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code float} and returns an object.
 */
public interface ByteByteFloat2RefFn<R> {
    R invoke(byte p1, byte p2, float p3);
}
