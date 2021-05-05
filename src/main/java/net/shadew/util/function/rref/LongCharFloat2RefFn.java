package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code float} and returns an object.
 */
public interface LongCharFloat2RefFn<R> {
    R invoke(long p1, char p2, float p3);
}
