package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns a {@code short}.
 */
public interface LongRefByte2ShortFn<P2> {
    short invoke(long p1, P2 p2, byte p3);
}
