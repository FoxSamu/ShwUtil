package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and a {@code char} and returns an object.
 */
public interface LongRefChar2RefFn<P2, R> {
    R invoke(Long p1, P2 p2, Char p3);
}
