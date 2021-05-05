package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface CharBoolDouble2RefFn<R> {
    R invoke(char p1, boolean p2, double p3);
}
