package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code short}.
 */
public interface CharByteRef2ShortFn<P3> {
    short invoke(char p1, byte p2, P3 p3);
}
