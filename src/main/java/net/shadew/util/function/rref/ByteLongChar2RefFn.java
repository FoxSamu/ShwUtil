package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code char} and returns an object.
 */
public interface ByteLongChar2RefFn<R> {
    R invoke(byte p1, long p2, char p3);
}
