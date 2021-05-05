package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code char} and returns an object.
 */
public interface CharCharChar2RefFn<R> {
    R invoke(char p1, char p2, char p3);
}