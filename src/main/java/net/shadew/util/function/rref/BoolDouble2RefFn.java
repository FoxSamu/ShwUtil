package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code double} and returns an object.
 */
public interface BoolDouble2RefFn<R> {
    R invoke(boolean p1, double p2);
}
