package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and an {@code int} and returns an object.
 */
public interface ShortCharInt2RefFn<R> {
    R invoke(short p1, char p2, int p3);
}
