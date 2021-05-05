package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns an {@code int}.
 */
public interface IntRefInt2IntFn<P2> {
    int invoke(int p1, P2 p2, int p3);
}
