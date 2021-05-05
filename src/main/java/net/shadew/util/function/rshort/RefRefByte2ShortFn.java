package net.shadew.util.function.rshort;

/**
 * A function that takes an object, an object and a {@code byte} and returns a {@code short}.
 */
public interface RefRefByte2ShortFn<P1, P2> {
    short invoke(P1 p1, P2 p2, byte p3);
}
