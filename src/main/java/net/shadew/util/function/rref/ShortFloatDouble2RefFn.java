package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code double} and returns an object.
 */
public interface ShortFloatDouble2RefFn<R> {
    R invoke(short p1, float p2, double p3);
}
