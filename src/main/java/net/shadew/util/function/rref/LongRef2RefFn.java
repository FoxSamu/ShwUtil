package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and an object and returns an object.
 */
public interface LongRef2RefFn<P2, R> {
    R invoke(long p1, P2 p2);
}
