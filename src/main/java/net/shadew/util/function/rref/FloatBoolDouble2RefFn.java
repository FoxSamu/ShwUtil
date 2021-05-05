package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface FloatBoolDouble2RefFn<R> {
    R invoke(float p1, boolean p2, double p3);
}
