package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and a {@code char} and returns an object.
 */
public interface FloatChar2RefFn<R> {
    R invoke(float p1, char p2);
}
