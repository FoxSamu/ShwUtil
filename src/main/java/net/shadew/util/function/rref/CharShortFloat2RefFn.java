package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code float} and returns an object.
 */
public interface CharShortFloat2RefFn<R> {
    R invoke(char p1, short p2, float p3);
}
