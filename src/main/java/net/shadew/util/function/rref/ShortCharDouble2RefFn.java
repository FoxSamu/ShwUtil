package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code double} and returns an object.
 */
public interface ShortCharDouble2RefFn<R> {
    R invoke(short p1, char p2, double p3);
}
