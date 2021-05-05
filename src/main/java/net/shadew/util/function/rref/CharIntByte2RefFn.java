package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code byte} and returns an object.
 */
public interface CharIntByte2RefFn<R> {
    R invoke(char p1, int p2, byte p3);
}
