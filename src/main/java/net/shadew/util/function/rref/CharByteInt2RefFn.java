package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and an {@code int} and returns an object.
 */
public interface CharByteInt2RefFn<R> {
    R invoke(char p1, byte p2, int p3);
}
