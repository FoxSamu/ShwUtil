package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface BoolCharBool2RefFn<R> {
    R invoke(boolean p1, char p2, boolean p3);
}
