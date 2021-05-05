package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns an object.
 */
public interface IntBoolRef2RefFn<P3, R> {
    R invoke(int p1, boolean p2, P3 p3);
}
