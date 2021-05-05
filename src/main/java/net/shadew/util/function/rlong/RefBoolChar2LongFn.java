package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and a {@code char} and returns a {@code long}.
 */
public interface RefBoolChar2LongFn<P1> {
    long invoke(P1 p1, boolean p2, char p3);
}
