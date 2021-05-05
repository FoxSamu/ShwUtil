package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code long} and returns an object.
 */
public interface BoolByteLong2RefFn<R> {
    R invoke(boolean p1, byte p2, long p3);
}
