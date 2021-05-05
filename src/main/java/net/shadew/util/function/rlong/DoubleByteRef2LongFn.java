package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns a {@code long}.
 */
public interface DoubleByteRef2LongFn<P3> {
    long invoke(double p1, byte p2, P3 p3);
}
