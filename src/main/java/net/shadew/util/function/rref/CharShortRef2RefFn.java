package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns an object.
 */
public interface CharShortRef2RefFn<P3, R> {
    R invoke(char p1, short p2, P3 p3);
}
