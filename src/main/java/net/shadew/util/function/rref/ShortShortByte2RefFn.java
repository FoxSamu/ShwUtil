package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code byte} and returns an object.
 */
public interface ShortShortByte2RefFn<R> {
    R invoke(short p1, short p2, byte p3);
}
