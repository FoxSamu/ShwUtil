package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code short} and returns an object.
 */
public interface ShortByteShort2RefFn<R> {
    R invoke(short p1, byte p2, short p3);
}
