package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code double} and an object and returns a {@code long}.
 */
public interface CharDoubleRef2LongFn<P3> {
    long invoke(char p1, double p2, P3 p3);
}
