package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and an object and returns nothing.
 */
public interface ByteRefRef2VoidFn<P2, P3> {
    void invoke(byte p1, P2 p2, P3 p3);
}
