package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and a {@code short} and returns a {@code long}.
 */
public interface ByteRefShort2LongFn<P2> {
    long invoke(byte p1, P2 p2, short p3);
}
