package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code char} and returns an object.
 */
public interface ByteFloatChar2RefFn<R> {
    R invoke(byte p1, float p2, char p3);
}
