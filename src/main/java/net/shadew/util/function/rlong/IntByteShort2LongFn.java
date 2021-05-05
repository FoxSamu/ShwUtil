package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code short} and returns a {@code long}.
 */
public interface IntByteShort2LongFn {
    long invoke(int p1, byte p2, short p3);
}
