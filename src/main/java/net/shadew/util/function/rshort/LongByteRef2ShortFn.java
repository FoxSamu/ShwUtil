package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code short}.
 */
public interface LongByteRef2ShortFn<P3> {
    short invoke(long p1, byte p2, P3 p3);
}
