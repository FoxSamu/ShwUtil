package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an object and a {@code char} and returns a {@code long}.
 */
public interface LongRefChar2LongFn<P2> {
    long invoke(long p1, P2 p2, char p3);
}
