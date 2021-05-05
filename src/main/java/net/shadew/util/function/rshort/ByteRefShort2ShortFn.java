package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte}, an object and a {@code short} and returns a {@code short}.
 */
public interface ByteRefShort2ShortFn<P2> {
    short invoke(byte p1, P2 p2, short p3);
}
