package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an object and an object and returns an object.
 */
public interface CharRefRef2RefFn<P2, P3, R> {
    R invoke(char p1, P2 p2, P3 p3);
}
