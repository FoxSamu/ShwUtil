package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns an {@code int}.
 */
public interface CharRefDouble2IntFn<P2> {
    int invoke(char p1, P2 p2, double p3);
}
