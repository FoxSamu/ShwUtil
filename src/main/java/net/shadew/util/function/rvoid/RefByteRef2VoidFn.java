package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, a {@code byte} and an object and returns nothing.
 */
public interface RefByteRef2VoidFn<P1, P3> {
    void invoke(P1 p1, byte p2, P3 p3);
}
