package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code short}.
 */
public interface ByteLongRef2ShortFn<P3> {
    short invoke(byte p1, long p2, P3 p3);
}