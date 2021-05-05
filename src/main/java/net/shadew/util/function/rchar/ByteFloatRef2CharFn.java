package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns a {@code char}.
 */
public interface ByteFloatRef2CharFn<P3> {
    char invoke(byte p1, float p2, P3 p3);
}
