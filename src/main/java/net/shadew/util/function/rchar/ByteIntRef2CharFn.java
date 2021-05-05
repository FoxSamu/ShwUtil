package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns a {@code char}.
 */
public interface ByteIntRef2CharFn<P3> {
    char invoke(byte p1, int p2, P3 p3);
}
