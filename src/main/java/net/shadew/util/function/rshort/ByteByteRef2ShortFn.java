package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code short}.
 */
public interface ByteByteRef2ShortFn<P3> {
    short invoke(byte p1, byte p2, P3 p3);
}
