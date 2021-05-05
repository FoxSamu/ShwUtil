package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns nothing.
 */
public interface LongByteRef2VoidFn<P3> {
    void invoke(long p1, byte p2, P3 p3);
}
