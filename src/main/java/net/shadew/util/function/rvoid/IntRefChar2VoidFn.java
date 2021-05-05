package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, an object and a {@code char} and returns nothing.
 */
public interface IntRefChar2VoidFn<P2> {
    void invoke(int p1, P2 p2, char p3);
}
