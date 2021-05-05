package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code float} and returns an object.
 */
public interface CharLongFloat2RefFn<R> {
    R invoke(char p1, long p2, float p3);
}
