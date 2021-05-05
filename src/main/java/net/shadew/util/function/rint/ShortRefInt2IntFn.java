package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns an {@code int}.
 */
public interface ShortRefInt2IntFn<P2> {
    int invoke(short p1, P2 p2, int p3);
}
