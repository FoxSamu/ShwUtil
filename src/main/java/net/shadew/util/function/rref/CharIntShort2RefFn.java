package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code short} and returns an object.
 */
public interface CharIntShort2RefFn<R> {
    R invoke(char p1, int p2, short p3);
}
