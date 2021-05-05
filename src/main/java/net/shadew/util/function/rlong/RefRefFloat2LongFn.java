package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an object and a {@code float} and returns a {@code long}.
 */
public interface RefRefFloat2LongFn<P1, P2> {
    long invoke(P1 p1, P2 p2, float p3);
}
