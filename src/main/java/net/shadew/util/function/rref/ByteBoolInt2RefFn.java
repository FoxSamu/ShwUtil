package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface ByteBoolInt2RefFn<R> {
    R invoke(byte p1, boolean p2, int p3);
}
