package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and a {@code short} and returns an {@code int}.
 */
public interface ByteRefShort2IntFn<P2> {
    int invoke(byte p1, P2 p2, short p3);
}
