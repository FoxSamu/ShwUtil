package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and an object and returns an object.
 */
public interface FloatBoolRef2RefFn<P3, R> {
    R invoke(float p1, boolean p2, P3 p3);
}
