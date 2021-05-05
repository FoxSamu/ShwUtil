package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code byte} and returns an object.
 */
public interface IntShortByte2RefFn<R> {
    R invoke(int p1, short p2, byte p3);
}
