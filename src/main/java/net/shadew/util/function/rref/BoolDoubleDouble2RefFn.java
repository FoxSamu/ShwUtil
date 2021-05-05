package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code double} and returns an object.
 */
public interface BoolDoubleDouble2RefFn<R> {
    R invoke(boolean p1, double p2, double p3);
}
