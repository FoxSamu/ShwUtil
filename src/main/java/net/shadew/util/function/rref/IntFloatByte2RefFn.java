package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code byte} and returns an object.
 */
public interface IntFloatByte2RefFn<R> {
    R invoke(int p1, float p2, byte p3);
}
