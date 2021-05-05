package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code short} and returns an object.
 */
public interface IntFloatShort2RefFn<R> {
    R invoke(int p1, float p2, short p3);
}
