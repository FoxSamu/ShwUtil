package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface DoubleBoolShort2RefFn<R> {
    R invoke(double p1, boolean p2, short p3);
}
