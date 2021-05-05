package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns nothing.
 */
public interface CharRefInt2VoidFn<P2> {
    void invoke(char p1, P2 p2, int p3);
}
