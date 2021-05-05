package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code char}.
 */
public interface CharRefByte2CharFn<P2> {
    char invoke(char p1, P2 p2, byte p3);
}
