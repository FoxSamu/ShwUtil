package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, an object and a {@code boolean} and returns a {@code char}.
 */
public interface ByteRefBool2CharFn<P2> {
    char invoke(byte p1, P2 p2, boolean p3);
}
