package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface ShortByteByte2RefFn<R> {
    R invoke(short p1, byte p2, byte p3);
}
