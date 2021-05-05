package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface CharBoolChar2RefFn<R> {
    R invoke(char p1, boolean p2, char p3);
}
