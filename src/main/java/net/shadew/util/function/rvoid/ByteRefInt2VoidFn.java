package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns nothing.
 */
public interface ByteRefInt2VoidFn<P2> {
    void invoke(byte p1, P2 p2, int p3);
}
