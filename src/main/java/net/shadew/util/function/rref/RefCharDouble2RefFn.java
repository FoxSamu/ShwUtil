package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code char} and a {@code double} and returns an object.
 */
public interface RefCharDouble2RefFn<P1, R> {
    R invoke(P1 p1, char p2, double p3);
}
