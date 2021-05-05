package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns an object.
 */
public interface ShortDoubleRef2RefFn<P3, R> {
    R invoke(short p1, double p2, P3 p3);
}
