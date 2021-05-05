package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns a {@code char}.
 */
public interface ByteShortRef2CharFn<P3> {
    char invoke(byte p1, short p2, P3 p3);
}
