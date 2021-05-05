package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns a {@code char}.
 */
public interface ByteRefLong2CharFn<P2> {
    char invoke(byte p1, P2 p2, long p3);
}
