package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns an {@code int}.
 */
public interface ByteShortRef2IntFn<P3> {
    int invoke(byte p1, short p2, P3 p3);
}
