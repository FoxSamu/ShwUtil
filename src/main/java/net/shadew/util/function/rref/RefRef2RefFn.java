package net.shadew.util.function.rref;

/**
 * A function that takes an object and an object and returns an object.
 */
public interface RefRef2RefFn<P1, P2, R> {
    R invoke(P1 p1, P2 p2);
}
