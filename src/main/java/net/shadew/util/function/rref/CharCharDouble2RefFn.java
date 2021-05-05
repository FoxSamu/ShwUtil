package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code double} and returns an object.
 */
public interface CharCharDouble2RefFn<R> {
    R invoke(char p1, char p2, double p3);
}
