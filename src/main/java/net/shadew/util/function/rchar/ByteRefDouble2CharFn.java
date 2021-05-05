package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns a {@code char}.
 */
public interface ByteRefDouble2CharFn<P2> {
    char invoke(byte p1, P2 p2, double p3);
}
