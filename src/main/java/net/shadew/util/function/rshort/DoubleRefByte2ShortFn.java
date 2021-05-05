package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns a {@code short}.
 */
public interface DoubleRefByte2ShortFn<P2> {
    short invoke(double p1, P2 p2, byte p3);
}
