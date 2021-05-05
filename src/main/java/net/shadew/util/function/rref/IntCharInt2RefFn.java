package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and an {@code int} and returns an object.
 */
public interface IntCharInt2RefFn<R> {
    R invoke(int p1, char p2, int p3);
}
