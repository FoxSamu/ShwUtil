package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code float} and returns an object.
 */
public interface LongShortFloat2RefFn<R> {
    R invoke(long p1, short p2, float p3);
}
