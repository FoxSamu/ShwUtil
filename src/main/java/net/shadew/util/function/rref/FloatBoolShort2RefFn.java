package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface FloatBoolShort2RefFn<R> {
    R invoke(float p1, boolean p2, short p3);
}
