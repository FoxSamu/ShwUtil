package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code long}.
 */
public interface LongCharRef2LongFn<P3> {
    long invoke(Long p1, Char p2, P3 p3);
}
