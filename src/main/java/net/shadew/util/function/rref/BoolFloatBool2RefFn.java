package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface BoolFloatBool2RefFn<R> {
    R invoke(boolean p1, float p2, boolean p3);
}
