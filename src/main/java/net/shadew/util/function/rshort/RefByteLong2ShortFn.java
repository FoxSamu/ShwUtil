package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code short}.
 */
public interface RefByteLong2ShortFn<P1> {
    short invoke(P1 p1, byte p2, long p3);
}
