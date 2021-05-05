package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and an object and returns an object.
 */
public interface CharBoolRef2RefFn<P3, R> {
    R invoke(char p1, boolean p2, P3 p3);
}
