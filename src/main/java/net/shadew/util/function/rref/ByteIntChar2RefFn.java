package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code char} and returns an object.
 */
public interface ByteIntChar2RefFn<R> {
    R invoke(byte p1, int p2, char p3);
}
