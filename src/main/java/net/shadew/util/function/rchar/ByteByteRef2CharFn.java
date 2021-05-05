package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code char}.
 */
public interface ByteByteRef2CharFn<P3> {
    char invoke(byte p1, byte p2, P3 p3);
}
