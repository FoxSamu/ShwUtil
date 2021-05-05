package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and an object and returns an object.
 */
public interface CharCharRef2RefFn<P3, R> {
    R invoke(char p1, char p2, P3 p3);
}
