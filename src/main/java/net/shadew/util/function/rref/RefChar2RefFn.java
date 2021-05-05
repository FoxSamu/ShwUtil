package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code char} and returns an object.
 */
public interface RefChar2RefFn<P1, R> {
    R invoke(P1 p1, char p2);
}
