package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns a {@code long}.
 */
public interface LongRefByte2LongFn<P2> {
    long invoke(long p1, P2 p2, byte p3);
}
