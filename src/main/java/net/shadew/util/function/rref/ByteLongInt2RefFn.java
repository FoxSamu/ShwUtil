package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and an {@code int} and returns an object.
 */
public interface ByteLongInt2RefFn<R> {
    R invoke(byte p1, long p2, int p3);
}
