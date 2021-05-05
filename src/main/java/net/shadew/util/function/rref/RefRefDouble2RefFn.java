package net.shadew.util.function.rref;

/**
 * A function that takes an object, an object and a {@code double} and returns an object.
 */
public interface RefRefDouble2RefFn<P1, P2, R> {
    R invoke(P1 p1, P2 p2, double p3);
}
