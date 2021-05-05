package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and a {@code char} and returns nothing.
 */
public interface ByteRefChar2VoidFn<P2> {
    void invoke(byte p1, P2 p2, char p3);
}
