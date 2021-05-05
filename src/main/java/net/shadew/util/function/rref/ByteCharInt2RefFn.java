package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and an {@code int} and returns an object.
 */
public interface ByteCharInt2RefFn<R> {
    R invoke(byte p1, char p2, int p3);
}
