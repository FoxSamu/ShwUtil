package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code char} and an object and returns a {@code long}.
 */
public interface DoubleCharRef2LongFn<P3> {
    long invoke(double p1, char p2, P3 p3);
}
