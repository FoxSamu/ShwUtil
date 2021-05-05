package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns nothing.
 */
public interface DoubleRefByte2VoidFn<P2> {
    void invoke(double p1, P2 p2, byte p3);
}
