package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and an object and returns an object.
 */
public interface FloatRef2RefFn<P2, R> {
    R invoke(float p1, P2 p2);
}
