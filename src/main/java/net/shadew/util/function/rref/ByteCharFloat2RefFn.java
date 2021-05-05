package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code float} and returns an object.
 */
public interface ByteCharFloat2RefFn<R> {
    R invoke(byte p1, char p2, float p3);
}
