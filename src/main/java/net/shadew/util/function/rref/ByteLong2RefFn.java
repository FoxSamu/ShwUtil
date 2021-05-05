package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code long} and returns an object.
 */
public interface ByteLong2RefFn<R> {
    R invoke(byte p1, long p2);
}
