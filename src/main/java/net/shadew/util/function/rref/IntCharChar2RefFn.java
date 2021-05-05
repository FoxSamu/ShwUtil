package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code char} and returns an object.
 */
public interface IntCharChar2RefFn<R> {
    R invoke(int p1, char p2, char p3);
}
