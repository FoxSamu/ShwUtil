package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an {@code int} and a {@code byte} and returns a {@code char}.
 */
public interface RefIntByte2CharFn<P1> {
    char invoke(P1 p1, int p2, byte p3);
}
