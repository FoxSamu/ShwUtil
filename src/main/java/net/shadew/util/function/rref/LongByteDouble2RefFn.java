package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code double} and returns an object.
 */
public interface LongByteDouble2RefFn<R> {
    R invoke(long p1, byte p2, double p3);
}
