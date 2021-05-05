package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code byte} and returns an object.
 */
public interface ShortIntByte2RefFn<R> {
    R invoke(short p1, int p2, byte p3);
}
