package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code byte} and an {@code int} and returns a {@code long}.
 */
public interface ShortByteInt2LongFn {
    long invoke(short p1, byte p2, int p3);
}
