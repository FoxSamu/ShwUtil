package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and a {@code double} and returns a {@code long}.
 */
public interface RefCharDouble2LongFn<P1> {
    long invoke(P1 p1, char p2, double p3);
}
