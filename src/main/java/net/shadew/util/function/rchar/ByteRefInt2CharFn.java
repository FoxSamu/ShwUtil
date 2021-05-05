package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code char}.
 */
public interface ByteRefInt2CharFn<P2> {
    char invoke(byte p1, P2 p2, int p3);
}
