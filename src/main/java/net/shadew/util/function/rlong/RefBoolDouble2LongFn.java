package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and a {@code double} and returns a {@code long}.
 */
public interface RefBoolDouble2LongFn<P1> {
    long invoke(P1 p1, boolean p2, double p3);
}
