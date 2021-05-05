package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int} and an object and returns an {@code int}.
 */
public interface IntRef2IntFn<P2> {
    int invoke(int p1, P2 p2);
}
