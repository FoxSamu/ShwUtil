package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code float} and returns an object.
 */
public interface IntShortFloat2RefFn<R> {
    R invoke(int p1, short p2, float p3);
}
