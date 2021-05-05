package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and an object and returns a {@code long}.
 */
public interface RefCharRef2LongFn<P1, P3> {
    long invoke(P1 p1, char p2, P3 p3);
}
