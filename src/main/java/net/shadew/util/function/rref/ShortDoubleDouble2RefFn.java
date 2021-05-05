package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code double} and returns an object.
 */
public interface ShortDoubleDouble2RefFn<R> {
    R invoke(short p1, double p2, double p3);
}
