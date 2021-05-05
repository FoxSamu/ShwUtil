package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and a {@code boolean} and returns an {@code int}.
 */
public interface ByteRefBool2IntFn<P2> {
    int invoke(byte p1, P2 p2, boolean p3);
}
