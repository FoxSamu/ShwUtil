package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code float} and returns an object.
 */
public interface BoolDoubleFloat2RefFn<R> {
    R invoke(boolean p1, double p2, float p3);
}
