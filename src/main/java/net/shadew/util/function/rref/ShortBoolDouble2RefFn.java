package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface ShortBoolDouble2RefFn<R> {
    R invoke(short p1, boolean p2, double p3);
}
