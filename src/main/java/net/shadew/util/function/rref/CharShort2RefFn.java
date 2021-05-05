package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code short} and returns an object.
 */
public interface CharShort2RefFn<R> {
    R invoke(char p1, short p2);
}
