package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface BoolDoubleBool2RefFn<R> {
    R invoke(Bool p1, Double p2, Bool p3);
}
