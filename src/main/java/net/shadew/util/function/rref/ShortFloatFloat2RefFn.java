package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code float} and returns an object.
 */
public interface ShortFloatFloat2RefFn<R> {
    R invoke(short p1, float p2, float p3);
}
