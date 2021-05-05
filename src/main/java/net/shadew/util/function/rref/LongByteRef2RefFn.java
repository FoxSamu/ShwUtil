package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns an object.
 */
public interface LongByteRef2RefFn<P3, R> {
    R invoke(long p1, byte p2, P3 p3);
}
