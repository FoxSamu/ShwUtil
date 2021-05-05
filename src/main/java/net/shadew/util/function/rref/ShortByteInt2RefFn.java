package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and an {@code int} and returns an object.
 */
public interface ShortByteInt2RefFn<R> {
    R invoke(short p1, byte p2, int p3);
}
