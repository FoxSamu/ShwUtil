package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns an object.
 */
public interface IntCharRef2RefFn<P3, R> {
    R invoke(int p1, char p2, P3 p3);
}
