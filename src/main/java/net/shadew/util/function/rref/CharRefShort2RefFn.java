package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an object and a {@code short} and returns an object.
 */
public interface CharRefShort2RefFn<P2, R> {
    R invoke(char p1, P2 p2, short p3);
}
