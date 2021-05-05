package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code short}.
 */
public interface ByteRefInt2ShortFn<P2> {
    short invoke(byte p1, P2 p2, int p3);
}
