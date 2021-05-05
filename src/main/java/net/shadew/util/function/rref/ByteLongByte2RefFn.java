package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code byte} and returns an object.
 */
public interface ByteLongByte2RefFn<R> {
    R invoke(byte p1, long p2, byte p3);
}
