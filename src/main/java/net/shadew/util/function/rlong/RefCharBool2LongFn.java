package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and a {@code boolean} and returns a {@code long}.
 */
public interface RefCharBool2LongFn<P1> {
    long invoke(P1 p1, char p2, boolean p3);
}
