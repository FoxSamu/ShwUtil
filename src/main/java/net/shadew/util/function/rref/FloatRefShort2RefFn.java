package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns an object.
 */
public interface FloatRefShort2RefFn<P2, R> {
    R invoke(float p1, P2 p2, short p3);
}
