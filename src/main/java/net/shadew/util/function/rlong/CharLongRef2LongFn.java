package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code long}.
 */
public interface CharLongRef2LongFn<P3> {
    long invoke(char p1, long p2, P3 p3);
}
