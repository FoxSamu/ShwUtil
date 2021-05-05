package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface BoolBoolDouble2RefFn<R> {
    R invoke(boolean p1, boolean p2, double p3);
}
