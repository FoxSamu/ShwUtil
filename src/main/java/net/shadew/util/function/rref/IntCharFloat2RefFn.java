package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code float} and returns an object.
 */
public interface IntCharFloat2RefFn<R> {
    R invoke(int p1, char p2, float p3);
}
