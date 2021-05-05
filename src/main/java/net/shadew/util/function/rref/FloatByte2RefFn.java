package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and a {@code byte} and returns an object.
 */
public interface FloatByte2RefFn<R> {
    R invoke(float p1, byte p2);
}
