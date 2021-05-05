package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns a {@code char}.
 */
public interface ByteCharRef2CharFn<P3> {
    char invoke(byte p1, char p2, P3 p3);
}
