package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns an object.
 */
public interface ByteRefInt2RefFn<P2, R> {
    R invoke(byte p1, P2 p2, int p3);
}
