package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code byte} and a {@code char} and returns a {@code short}.
 */
public interface RefByteChar2ShortFn<P1> {
    short invoke(P1 p1, byte p2, char p3);
}
