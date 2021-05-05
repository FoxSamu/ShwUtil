package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code byte} and returns a {@code long}.
 */
public interface LongShortByte2LongFn {
    long invoke(long p1, short p2, byte p3);
}
