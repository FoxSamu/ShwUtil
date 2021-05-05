package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and an object and returns an object.
 */
public interface FloatShortRef2RefFn<P3, R> {
    R invoke(float p1, short p2, P3 p3);
}
