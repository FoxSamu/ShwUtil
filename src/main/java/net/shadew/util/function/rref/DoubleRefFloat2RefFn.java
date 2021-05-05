package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns an object.
 */
public interface DoubleRefFloat2RefFn<P2, R> {
    R invoke(Double p1, P2 p2, Float p3);
}
