package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, a {@code char} and an object and returns nothing.
 */
public interface RefCharRef2VoidFn<P1, P3> {
    void invoke(P1 p1, char p2, P3 p3);
}
