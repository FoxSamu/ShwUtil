package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns an {@code int}.
 */
public interface CharRefInt2IntFn<P2> {
    int invoke(char p1, P2 p2, int p3);
}
