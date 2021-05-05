package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and a {@code double} and returns an object.
 */
public interface FloatDouble2RefFn<R> {
    R invoke(float p1, double p2);
}
