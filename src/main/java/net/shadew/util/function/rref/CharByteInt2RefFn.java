package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and an {@code int} and returns an object.
 */
public interface CharByteInt2RefFn<R> {
    R invoke(Char p1, Byte p2, Int p3);
}
