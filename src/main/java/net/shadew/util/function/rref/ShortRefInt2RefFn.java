package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns an object.
 */
public interface ShortRefInt2RefFn<P2, R> {
    R invoke(short p1, P2 p2, int p3);
}
