package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns nothing.
 */
public interface LongRefByte2VoidFn<P2> {
    void invoke(long p1, P2 p2, byte p3);
}
