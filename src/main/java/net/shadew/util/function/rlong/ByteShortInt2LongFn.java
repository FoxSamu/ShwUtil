package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code short} and an {@code int} and returns a {@code long}.
 */
public interface ByteShortInt2LongFn {
    long invoke(byte p1, short p2, int p3);
}
