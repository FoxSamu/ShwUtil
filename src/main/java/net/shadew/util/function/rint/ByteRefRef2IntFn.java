package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and an object and returns an {@code int}.
 */
public interface ByteRefRef2IntFn<P2, P3> {
    int invoke(byte p1, P2 p2, P3 p3);
}
