package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code char} and returns an object.
 */
public interface ShortFloatChar2RefFn<R> {
    R invoke(short p1, float p2, char p3);
}
