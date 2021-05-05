package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte} and an object and returns nothing.
 */
public interface ByteRef2VoidFn<P2> {
    void invoke(byte p1, P2 p2);
}
