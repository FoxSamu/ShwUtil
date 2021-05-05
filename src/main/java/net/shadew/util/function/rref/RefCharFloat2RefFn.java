package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code char} and a {@code float} and returns an object.
 */
public interface RefCharFloat2RefFn<P1, R> {
    R invoke(P1 p1, char p2, float p3);
}
