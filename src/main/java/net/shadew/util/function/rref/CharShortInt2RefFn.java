package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and an {@code int} and returns an object.
 */
public interface CharShortInt2RefFn<R> {
    R invoke(char p1, short p2, int p3);
}
