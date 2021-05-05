package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns a {@code long}.
 */
public interface RefCharInt2LongFn<P1> {
    long invoke(P1 p1, char p2, int p3);
}
