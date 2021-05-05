package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code float} and returns an object.
 */
public interface LongFloat2RefFn<R> {
    R invoke(long p1, float p2);
}
