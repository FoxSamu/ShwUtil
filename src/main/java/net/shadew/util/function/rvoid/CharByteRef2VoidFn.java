package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns nothing.
 */
public interface CharByteRef2VoidFn<P3> {
    void invoke(char p1, byte p2, P3 p3);
}
