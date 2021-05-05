package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code double} and returns an object.
 */
public interface ShortShortDouble2RefFn<R> {
    R invoke(short p1, short p2, double p3);
}
