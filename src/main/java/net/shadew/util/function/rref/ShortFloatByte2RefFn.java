package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code byte} and returns an object.
 */
public interface ShortFloatByte2RefFn<R> {
    R invoke(short p1, float p2, byte p3);
}
