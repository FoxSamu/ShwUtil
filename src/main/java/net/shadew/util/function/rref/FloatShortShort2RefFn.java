package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code short} and returns an object.
 */
public interface FloatShortShort2RefFn<R> {
    R invoke(float p1, short p2, short p3);
}
