package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface FloatShortBool2RefFn<R> {
    R invoke(float p1, short p2, boolean p3);
}
