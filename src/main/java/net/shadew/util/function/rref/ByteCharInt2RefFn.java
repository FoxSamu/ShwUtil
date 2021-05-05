package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and an {@code int} and returns an object.
 */
public interface ByteCharInt2RefFn<R> {
    R invoke(Byte p1, Char p2, Int p3);
}
