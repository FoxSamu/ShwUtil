package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns a {@code long}.
 */
public interface CharRefDouble2LongFn<P2> {
    long invoke(char p1, P2 p2, double p3);
}
