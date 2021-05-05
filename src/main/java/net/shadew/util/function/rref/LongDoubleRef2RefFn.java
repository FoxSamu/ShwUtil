package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns an object.
 */
public interface LongDoubleRef2RefFn<P3, R> {
    R invoke(Long p1, Double p2, P3 p3);
}
