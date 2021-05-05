package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code char} and returns an object.
 */
public interface CharShortChar2RefFn<R> {
    R invoke(char p1, short p2, char p3);
}
