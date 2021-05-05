package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns an {@code int}.
 */
public interface LongRefByte2IntFn<P2> {
    int invoke(long p1, P2 p2, byte p3);
}