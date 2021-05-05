package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code short} and returns an object.
 */
public interface IntByteShort2RefFn<R> {
    R invoke(int p1, byte p2, short p3);
}
