package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code boolean} and returns a {@code long}.
 */
public interface ShortByteBool2LongFn {
    long invoke(short p1, byte p2, boolean p3);
}
