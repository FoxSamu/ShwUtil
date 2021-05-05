package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code byte} and returns an object.
 */
public interface FloatLongByte2RefFn<R> {
    R invoke(float p1, long p2, byte p3);
}
