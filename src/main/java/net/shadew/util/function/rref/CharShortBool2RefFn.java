package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface CharShortBool2RefFn<R> {
    R invoke(char p1, short p2, boolean p3);
}
