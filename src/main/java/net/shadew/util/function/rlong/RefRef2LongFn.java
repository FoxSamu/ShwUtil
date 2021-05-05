package net.shadew.util.function.rlong;

/**
 * A function that takes an object and an object and returns a {@code long}.
 */
public interface RefRef2LongFn<P1, P2> {
    long invoke(P1 p1, P2 p2);
}
