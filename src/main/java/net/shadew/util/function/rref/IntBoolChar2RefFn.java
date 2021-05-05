package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface IntBoolChar2RefFn<R> {
    R invoke(int p1, boolean p2, char p3);
}
