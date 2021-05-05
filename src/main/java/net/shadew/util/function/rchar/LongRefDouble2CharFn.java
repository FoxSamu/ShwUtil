package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, an object and a {@code double} and returns a {@code char}.
 */
public interface LongRefDouble2CharFn<P2> {
    char invoke(long p1, P2 p2, double p3);
}
