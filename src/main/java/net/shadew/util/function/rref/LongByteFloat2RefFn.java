package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code float} and returns an object.
 */
public interface LongByteFloat2RefFn<R> {
    R invoke(long p1, byte p2, float p3);
}
