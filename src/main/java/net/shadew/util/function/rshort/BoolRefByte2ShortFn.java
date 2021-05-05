package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns a {@code short}.
 */
public interface BoolRefByte2ShortFn<P2> {
    short invoke(boolean p1, P2 p2, byte p3);
}
