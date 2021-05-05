package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code char} and an object and returns a {@code long}.
 */
public interface CharCharRef2LongFn<P3> {
    long invoke(char p1, char p2, P3 p3);
}
