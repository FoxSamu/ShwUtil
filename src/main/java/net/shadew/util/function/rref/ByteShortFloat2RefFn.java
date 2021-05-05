package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code float} and returns an object.
 */
public interface ByteShortFloat2RefFn<R> {
    R invoke(byte p1, short p2, float p3);
}
