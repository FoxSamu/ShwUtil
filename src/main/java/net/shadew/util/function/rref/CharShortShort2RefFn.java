package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code short} and returns an object.
 */
public interface CharShortShort2RefFn<R> {
    R invoke(char p1, short p2, short p3);
}
