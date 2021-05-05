package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code float} and returns an object.
 */
public interface RefFloat2RefFn<P1, R> {
    R invoke(P1 p1, float p2);
}
