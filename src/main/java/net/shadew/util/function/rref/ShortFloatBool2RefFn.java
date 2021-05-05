package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface ShortFloatBool2RefFn<R> {
    R invoke(short p1, float p2, boolean p3);
}
