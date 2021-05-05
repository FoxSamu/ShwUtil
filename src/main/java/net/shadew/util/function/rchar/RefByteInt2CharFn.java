package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns a {@code char}.
 */
public interface RefByteInt2CharFn<P1> {
    char invoke(P1 p1, byte p2, int p3);
}
