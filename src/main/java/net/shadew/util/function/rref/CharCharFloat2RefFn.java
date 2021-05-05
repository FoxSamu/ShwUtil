package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code float} and returns an object.
 */
public interface CharCharFloat2RefFn<R> {
    R invoke(char p1, char p2, float p3);
}
