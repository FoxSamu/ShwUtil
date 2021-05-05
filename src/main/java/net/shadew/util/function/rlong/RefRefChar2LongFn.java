package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an object and a {@code char} and returns a {@code long}.
 */
public interface RefRefChar2LongFn<P1, P2> {
    long invoke(P1 p1, P2 p2, char p3);
}
