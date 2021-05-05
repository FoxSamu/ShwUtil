package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code char} and returns an object.
 */
public interface BoolIntChar2RefFn<R> {
    R invoke(boolean p1, int p2, char p3);
}
