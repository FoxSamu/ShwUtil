package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns an object.
 */
public interface ByteIntRef2RefFn<P3, R> {
    R invoke(byte p1, int p2, P3 p3);
}
