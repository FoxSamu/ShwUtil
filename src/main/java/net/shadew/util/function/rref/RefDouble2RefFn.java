package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code double} and returns an object.
 */
public interface RefDouble2RefFn<P1, R> {
    R invoke(P1 p1, double p2);
}
