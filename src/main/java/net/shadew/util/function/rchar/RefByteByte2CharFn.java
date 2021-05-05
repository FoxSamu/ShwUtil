package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code byte} and a {@code byte} and returns a {@code char}.
 */
public interface RefByteByte2CharFn<P1> {
    char invoke(P1 p1, byte p2, byte p3);
}
