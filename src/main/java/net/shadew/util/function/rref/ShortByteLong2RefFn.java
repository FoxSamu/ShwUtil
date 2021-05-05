package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code long} and returns an object.
 */
public interface ShortByteLong2RefFn<R> {
    R invoke(short p1, byte p2, long p3);
}
