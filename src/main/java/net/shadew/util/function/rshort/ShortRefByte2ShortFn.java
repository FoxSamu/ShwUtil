package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short}, an object and a {@code byte} and returns a {@code short}.
 */
public interface ShortRefByte2ShortFn<P2> {
    short invoke(short p1, P2 p2, byte p3);
}
