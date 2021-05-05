package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and an {@code int} and returns an object.
 */
public interface BoolCharInt2RefFn<R> {
    R invoke(boolean p1, char p2, int p3);
}
