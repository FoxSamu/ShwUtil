package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface LongBoolByte2RefFn<R> {
    R invoke(long p1, boolean p2, byte p3);
}
