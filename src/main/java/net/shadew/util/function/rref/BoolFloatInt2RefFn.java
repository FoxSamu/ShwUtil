package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and an {@code int} and returns an object.
 */
public interface BoolFloatInt2RefFn<R> {
    R invoke(boolean p1, float p2, int p3);
}
