package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code short} and returns an object.
 */
public interface CharCharShort2RefFn<R> {
    R invoke(char p1, char p2, short p3);
}
