package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code byte} and returns an object.
 */
public interface BoolFloatByte2RefFn<R> {
    R invoke(boolean p1, float p2, byte p3);
}
