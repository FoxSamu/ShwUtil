package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code short} and returns an object.
 */
public interface ShortFloatShort2RefFn<R> {
    R invoke(short p1, float p2, short p3);
}
