package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns nothing.
 */
public interface IntLongRef2VoidFn<P3> {
    void invoke(int p1, long p2, P3 p3);
}
