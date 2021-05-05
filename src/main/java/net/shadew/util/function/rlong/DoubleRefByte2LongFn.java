package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns a {@code long}.
 */
public interface DoubleRefByte2LongFn<P2> {
    long invoke(double p1, P2 p2, byte p3);
}
