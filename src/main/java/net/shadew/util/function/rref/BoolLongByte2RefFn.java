package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code byte} and returns an object.
 */
public interface BoolLongByte2RefFn<R> {
    R invoke(boolean p1, long p2, byte p3);
}
