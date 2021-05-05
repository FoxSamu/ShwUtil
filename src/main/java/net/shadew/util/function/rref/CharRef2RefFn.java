package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and an object and returns an object.
 */
public interface CharRef2RefFn<P2, R> {
    R invoke(char p1, P2 p2);
}
