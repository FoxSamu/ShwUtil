package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code char}.
 */
public interface LongDoubleRef2CharFn<P3> {
    char invoke(long p1, double p2, P3 p3);
}
