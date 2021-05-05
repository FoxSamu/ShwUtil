package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code byte} and returns an object.
 */
public interface ShortByte2RefFn<R> {
    R invoke(short p1, byte p2);
}
