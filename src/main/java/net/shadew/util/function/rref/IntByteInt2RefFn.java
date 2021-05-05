package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and an {@code int} and returns an object.
 */
public interface IntByteInt2RefFn<R> {
    R invoke(int p1, byte p2, int p3);
}
