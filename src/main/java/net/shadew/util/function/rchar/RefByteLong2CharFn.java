package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code char}.
 */
public interface RefByteLong2CharFn<P1> {
    char invoke(P1 p1, byte p2, long p3);
}
