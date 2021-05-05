package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code double} and returns a {@code long}.
 */
public interface RefDouble2LongFn<P1> {
    long invoke(P1 p1, double p2);
}
