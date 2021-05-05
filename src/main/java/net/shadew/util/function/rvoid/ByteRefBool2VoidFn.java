package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and a {@code boolean} and returns nothing.
 */
public interface ByteRefBool2VoidFn<P2> {
    void invoke(byte p1, P2 p2, boolean p3);
}
