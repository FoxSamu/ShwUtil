package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface ShortCharBool2RefFn<R> {
    R invoke(short p1, char p2, boolean p3);
}
