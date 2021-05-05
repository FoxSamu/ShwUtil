package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte} and an object and returns a {@code short}.
 */
public interface ByteRef2ShortFn<P2> {
    short invoke(byte p1, P2 p2);
}
