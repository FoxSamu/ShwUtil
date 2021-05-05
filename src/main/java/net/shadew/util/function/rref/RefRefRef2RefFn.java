package net.shadew.util.function.rref;

/**
 * A function that takes an object, an object and an object and returns an object.
 */
public interface RefRefRef2RefFn<P1, P2, P3, R> {
    R invoke(P1 p1, P2 p2, P3 p3);
}
