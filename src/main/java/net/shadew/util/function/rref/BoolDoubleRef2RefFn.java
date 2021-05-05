package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns an object.
 */
public interface BoolDoubleRef2RefFn<P3, R> {
    R invoke(boolean p1, double p2, P3 p3);
}
