package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface FloatBoolByte2RefFn<R> {
    R invoke(float p1, boolean p2, byte p3);
}
