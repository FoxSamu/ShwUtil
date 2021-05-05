package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code byte} and returns an object.
 */
public interface ShortLongByte2RefFn<R> {
    R invoke(short p1, long p2, byte p3);
}
