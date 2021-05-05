package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code double} and an object and returns a {@code char}.
 */
public interface ByteDoubleRef2CharFn<P3> {
    char invoke(byte p1, double p2, P3 p3);
}
