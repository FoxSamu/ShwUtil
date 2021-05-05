package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns an object.
 */
public interface IntByteRef2RefFn<P3, R> {
    R invoke(int p1, byte p2, P3 p3);
}
