package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and a {@code float} and returns a {@code long}.
 */
public interface RefCharFloat2LongFn<P1> {
    long invoke(P1 p1, char p2, float p3);
}
