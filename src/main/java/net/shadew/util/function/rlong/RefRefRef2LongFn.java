package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an object and an object and returns a {@code long}.
 */
public interface RefRefRef2LongFn<P1, P2, P3> {
    long invoke(P1 p1, P2 p2, P3 p3);
}
