package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code char} and returns an object.
 */
public interface ShortDoubleChar2RefFn<R> {
    R invoke(short p1, double p2, char p3);
}
