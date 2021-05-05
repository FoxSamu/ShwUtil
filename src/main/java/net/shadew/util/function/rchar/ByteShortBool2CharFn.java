package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code boolean} and returns a {@code char}.
 */
public interface ByteShortBool2CharFn {
    char invoke(byte p1, short p2, boolean p3);
}