package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns an {@code int}.
 */
public interface ByteRefDouble2IntFn<P2> {
    int invoke(byte p1, P2 p2, double p3);
}
