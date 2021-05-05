package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code long} and returns an object.
 */
public interface IntByteLong2RefFn<R> {
    R invoke(int p1, byte p2, long p3);
}
