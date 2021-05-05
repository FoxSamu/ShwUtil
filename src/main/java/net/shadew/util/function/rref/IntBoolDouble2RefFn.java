package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface IntBoolDouble2RefFn<R> {
    R invoke(int p1, boolean p2, double p3);
}
