package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code boolean} and a {@code char} and returns an object.
 */
public interface RefBoolChar2RefFn<P1, R> {
    R invoke(P1 p1, boolean p2, char p3);
}
