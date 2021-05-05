package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and a {@code char} and returns nothing.
 */
public interface LongRefChar2VoidFn<P2> {
    void invoke(long p1, P2 p2, char p3);
}
