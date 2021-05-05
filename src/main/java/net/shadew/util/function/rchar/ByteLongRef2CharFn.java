package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code char}.
 */
public interface ByteLongRef2CharFn<P3> {
    char invoke(byte p1, long p2, P3 p3);
}
