package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code long}.
 */
public interface CharRefInt2LongFn<P2> {
    long invoke(char p1, P2 p2, int p3);
}
