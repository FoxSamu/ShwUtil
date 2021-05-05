package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code byte} and returns an object.
 */
public interface FloatShortByte2RefFn<R> {
    R invoke(float p1, short p2, byte p3);
}
