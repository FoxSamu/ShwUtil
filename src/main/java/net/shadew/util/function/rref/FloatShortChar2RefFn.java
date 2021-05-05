package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code char} and returns an object.
 */
public interface FloatShortChar2RefFn<R> {
    R invoke(float p1, short p2, char p3);
}
