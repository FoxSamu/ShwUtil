package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code float} and returns an object.
 */
public interface ShortDoubleFloat2RefFn<R> {
    R invoke(short p1, double p2, float p3);
}
