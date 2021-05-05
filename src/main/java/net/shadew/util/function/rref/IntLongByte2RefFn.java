package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code byte} and returns an object.
 */
public interface IntLongByte2RefFn<R> {
    R invoke(int p1, long p2, byte p3);
}
